package com.sharma.nks.spbo.controllers;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sharma.nks.spbo.beans.CredentialsBean;
import com.sharma.nks.spbo.beans.UserProfile;
import com.sharma.nks.spbo.beans.requests.AuthenticationRequest;
import com.sharma.nks.spbo.beans.requests.CreateUserProfileRequest;
import com.sharma.nks.spbo.beans.requests.CreateUserProfileResponse;
import com.sharma.nks.spbo.svc.ICredentialServices;
import com.sharma.nks.spbo.svc.IUserProfileServices;
import com.sharma.nks.spbo.utils.TechnicalException;
import com.sharma.nks.spbo.utils.ValidationException;

@Controller
@RequestMapping("/user")
public class AuthenticationController {
	
	private final Logger logger=Logger.getLogger(AuthenticationController.class);

	@Autowired
	IUserProfileServices userProfileService;
	@Autowired
	ICredentialServices credService;
	
	@RequestMapping(value="/homepage",method=RequestMethod.GET)
	public ModelAndView loginAuthenticateBySession(HttpSession sess){
		if(null!=sess.getAttribute("session_userId")){
			String uid=(String) sess.getAttribute("session_userId");
			return new ModelAndView("homepage","user_id",uid);
		}
		return new ModelAndView("redirect:/login.jsp","error","Login first.");	
	}
	
	@RequestMapping(value="/homepage",method=RequestMethod.POST)
	public ModelAndView loginAuthenticate(@ModelAttribute("loginForm") CredentialsBean cb,BindingResult result,	HttpSession sess){
		Long start=System.currentTimeMillis();
		ModelAndView mv;
		String uid=null;
		boolean isSuccess = false;
		AuthenticationRequest authenticationRequest=new AuthenticationRequest();
		authenticationRequest.setCredentials(cb);
		if(result.hasErrors()){
			uid="Problem "+result.getFieldError();
			mv=new ModelAndView();
			mv.addObject("error", uid);
			return mv;	
		}else{
			
			try {
				isSuccess = credService.authenticate(authenticationRequest);
			} catch (TechnicalException e) {
				e.printStackTrace();
			}
			uid=cb.getUserId();
			System.out.println("Time taken in authenticating: "+(System.currentTimeMillis()-start));
			if(isSuccess==true){
				sess.setAttribute("session_userId", uid);
				return new ModelAndView("homepage","user_id",uid);
			}else{
				uid="User id or password is wrong.";
				result.reject("error", uid);
				return new ModelAndView("redirect:/login.jsp","error",uid);	
			}
		}
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView addNewUserProfile(UserProfile profile, BindingResult result){
		Long start=System.currentTimeMillis();
		logger.debug("inside addNewUserProfile(UserProfile profile,CredentialsBean cb, BindingResult result");
		CreateUserProfileResponse uid=null;
		CreateUserProfileRequest profileRequest=new CreateUserProfileRequest();
		
		if(result.hasErrors()){
			return new ModelAndView("redirect:/registration.jsp","error",uid);		
		}
		try {
			profileRequest.setUserProfile(profile);
			uid=userProfileService.addNewUser(profileRequest);
		} catch (ValidationException e) {
			e.printStackTrace();
		} catch (TechnicalException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Time taken to register: "+(System.currentTimeMillis()-start));
		return new ModelAndView("homepage","user_id",uid);
	}
	
	
	@RequestMapping("/logout")
	public String logoutUser(HttpSession sess){
		System.out.println(sess.getAttribute("session_userId"));
		String logoutUrl="redirect:/login.jsp";
		String userId=(String) sess.getAttribute("session_userId");
		sess.setAttribute("session_userId", null);
		logger.debug("session set to null.");
		if(null!=userId){
			try {
				credService.logout(userId);
			} catch (TechnicalException e) {
				e.printStackTrace();
			}
		}
		return logoutUrl;
	}

}
