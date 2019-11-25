package com.gaze.biz.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaze.biz.UserBiz;
import com.gaze.dao.UserDao;
import com.gaze.entity.User;
import com.gaze.util.MD5Util;

@Service

public class UserBizImpl implements UserBiz {
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

	@Override
	public User getUser(String userphone, String password) {
		return userDao.getUser(userphone, MD5Util.getMd5(password));
	}
	
	
	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}
	
	@Override
	public User getByName(String userphone) {
		return userDao.getByName(userphone);
	}

}
