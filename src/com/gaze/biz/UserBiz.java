package com.gaze.biz;



import com.gaze.entity.User;

public interface UserBiz {
	/**
	 * 登录
	 * @param 手机号
	 * @param pwd  密码
	 * @return
	 */
	public User getUser(String userphone,String password);
	
	public int addUser(User user);
	
	public User getByName(String userphone);
}
