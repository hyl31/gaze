package com.gaze.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gaze.entity.User;

@Repository
public interface UserDao {

	public User getUser(@Param("userphone") String userphone, @Param("password") String password);

	public int addUser(User user);

	public User getByName(String userphone);
}
