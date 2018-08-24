package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.UserProfile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserProfileDaoImpl implements UserProfileDao{


	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List<UserProfile> getAllUserProfile() {
		Session session = this.sessionFactory.getCurrentSession();
		List<UserProfile> userList = session.createQuery("from UserProfile").list();
		return userList;
	}

	@Override
	public UserProfile getUserProfile(String userId) {
		Session session = this.sessionFactory.getCurrentSession();
		UserProfile userProfile = (UserProfile) session.get(UserProfile.class, userId);
		return null;
	}

	@Override
	public UserProfile addUserProfile(UserProfile userProfile) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(userProfile);
		return null;
	}

	@Override
	public void updateUserProfile(UserProfile userProfile) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(userProfile);
		
	}

	 @Override
	public void deleteUserProfile(String userId) {
		// TODO Auto-generated method stub
		
	} 
}
