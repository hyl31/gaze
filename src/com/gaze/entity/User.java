package com.gaze.entity;

import java.io.Serializable;
import java.util.Date;



public class User implements Serializable {

	// Fields
	/** 编号主键 */
	private Integer userId;
	/** 手机账号 */
	private String userphone;
	/** 邮箱账号 */
	private String useremail;
	/** 点赞数 */
	private Integer like;
	/** 学号 注册一位加1 */
	private String studentNum;
	/** 班级id */
	private Integer classId;
	/** 创建时间 */
	private Date createtime;
	/** 最后登陆时间 */
	private Date lasttime;
	/** 绑定时间 */
	private Date boundtime;
	/** 头像 */
	private String headImg;
	/** 订单 */
	private String oderId;
	/** 绑定状态 0未绑定，1绑定 */
	private Integer boundstatus;
	/** 用户状态 0上课中，2未开课，3已结束 */
	private Integer userstatus;
	/** 登录密码 */
	private String password;
	/** 学生姓名 */
	private String username;
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User() {
	}

	public User(Integer userId, String userphone,String password) {
		this.userId = userId;
		this.userphone = userphone;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getLasttime() {
		return lasttime;
	}

	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

	public Date getBoundtime() {
		return boundtime;
	}

	public void setBoundtime(Date boundtime) {
		this.boundtime = boundtime;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getOderId() {
		return oderId;
	}

	public void setOderId(String oderId) {
		this.oderId = oderId;
	}

	public Integer getBoundstatus() {
		return boundstatus;
	}

	public void setBoundstatus(Integer boundstatus) {
		this.boundstatus = boundstatus;
	}

	public Integer getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(Integer userstatus) {
		this.userstatus = userstatus;
	}

}