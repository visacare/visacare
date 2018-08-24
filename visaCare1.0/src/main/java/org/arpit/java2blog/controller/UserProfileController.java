package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.UserProfile;
import org.arpit.java2blog.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

	@Autowired
	UserProfileService userProfileService;

	@RequestMapping(value = "/getAllUserProfile", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<UserProfile> getAllUserProfile(Model model) {

		List<UserProfile> listOfUserProfile = userProfileService.getAllUserProfile();
		System.out.println("listOfUserProfile "+listOfUserProfile.size());
		model.addAttribute("userProfile", new UserProfile());
		model.addAttribute("listOfUserProfile", listOfUserProfile);
		return listOfUserProfile;
	}

	/*@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllUserProfile";
	}*/

	@RequestMapping(value = "/getUserProfile/{userid}", method = RequestMethod.GET, headers = "Accept=application/json")
	public void getUserProfileById(@PathVariable String userid) {
		userProfileService.getUserProfile(userid);
	}

	@RequestMapping(value = "/addUserProfile", method = RequestMethod.POST, headers = "Accept=application/json")
	public UserProfile addUserProfile(@RequestBody UserProfile userProfile) {
		return userProfileService.addUserProfile(userProfile);

	}

	@RequestMapping(value = "/addUserProfile", method = RequestMethod.PUT, headers = "Accept=application/json")
	public UserProfile updateUserProfile(@RequestBody UserProfile userProfile) {
		return userProfileService.updateUserProfile(userProfile); 

	}	

	@RequestMapping(value = "/deleteUserProfile/{userid}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteUserProfile(@PathVariable("userid") String userid) {
		userProfileService.getUserProfile(userid);


	}	
}
