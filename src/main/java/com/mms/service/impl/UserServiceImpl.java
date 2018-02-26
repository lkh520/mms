/**
 * project : mms-web
 * package : com.mms.service.impl
 * fileName: UserServiceImpl.java
 * createAt:2018年2月9日 上午6:07:50
 * createBy:lkh
 */
package com.mms.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.mms.mapper.UsersMapper;
import com.mms.model.Users;
import com.mms.model.UsersExample;
import com.mms.model.UsersExample.Criteria;
import com.mms.service.UserService;

/**
 * @author lkh
 *
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public int addUser(Users user) {
		user.setCreateTime(new Date());
		user.setVsername(user.getLoginName());
		user.setLoginCount(new Long(0));
		return usersMapper.insertSelective(user);
	}
	@Override
	public List<Users> findAllUser(int pageNum, int pageSize) {
		// 将参数传给这个方法就可以实现物理分页了，非常简单。
		PageHelper.startPage(pageNum, pageSize);
		return null;
		//return usersMapper.selectAllUser();
	}
	@Override
	public Users findUserBySearch(Users user) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(user.getLoginName());
		//criteria.andUsernameIsNull();
		criteria.andPasswordEqualTo(user.getPassword());
		//criteria.andPasswordIsNull();
		List<Users> userList = usersMapper.selectByExample(example);
		if(userList != null && userList.size()==1){
			return userList.get(0);
		}else{
			return null;
		}
	}
}
