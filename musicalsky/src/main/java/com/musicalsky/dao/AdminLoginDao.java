package com.musicalsky.dao;

import com.musicalsky.entity.AdminLogin;

public interface AdminLoginDao {

	/**
	 * ����mybatis
	 * 
	 * @param account
	 * @return
	 */
	public AdminLogin testMybatis(String loginAccount);

	/**
	 * �û���½�ж�
	 * 
	 * @param adminL
	 * @return
	 */
	public AdminLogin login(AdminLogin adminL);

}