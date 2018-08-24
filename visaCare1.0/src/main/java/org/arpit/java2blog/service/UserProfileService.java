package org.arpit.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.dao.UserProfileDao;
import org.arpit.java2blog.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userProfileService")
public class UserProfileService {

	@Autowired
	UserProfileDao userProfileDao;

	@Transactional
	public List<UserProfile> getAllUserProfile() {
		return userProfileDao.getAllUserProfile();
	}

	@Transactional
	public UserProfile getUserProfile(String userid) {
		return userProfileDao.getUserProfile(userid);
	}

	@Transactional
	public UserProfile addUserProfile(UserProfile userProfile) {
		userProfileDao.addUserProfile(userProfile);
		return userProfile;
	}

	@Transactional
	public UserProfile updateUserProfile(UserProfile userProfile) {
		userProfileDao.updateUserProfile(userProfile);
		return userProfile;
	}

	@Transactional
	public void deleteCustomer(String userid) {
		//userProfileDao.deleteUserProfile(id);
	}
}
