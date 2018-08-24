package org.arpit.java2blog.dao;
import java.util.List;

 
import org.arpit.java2blog.model.UserProfile;
public interface UserProfileDao {
	public List<UserProfile> getAllUserProfile() ;

	public UserProfile getUserProfile(String userId) ;

	public UserProfile addUserProfile(UserProfile userProfile);

	public void updateUserProfile(UserProfile userProfile) ;

	public void deleteUserProfile(String userId) ;
}
