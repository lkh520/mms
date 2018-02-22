/**
 * project : mms-web
 * package : com.mms.service
 * fileName: UserService.java
 * createAt:2018年2月9日 上午6:04:26
 * createBy:lkh
 */
package com.mms.service;

import java.util.List;

import com.mms.model.Users;

/**
 * @author lkh
 *
 */
public interface UserService {
	public Users findUserBySearch(Users user);
	
	public int addUser(Users user);

    public List<Users> findAllUser(int pageNum, int pageSize);
}
