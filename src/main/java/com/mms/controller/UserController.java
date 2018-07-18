/**
 * project : mms-web
 * package : com.mms.Controller
 * fileName: UserController.java
 * createAt:2018年2月9日 上午6:05:06
 * createBy:lkh
 */
package com.mms.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.mms.mapper.UsersMapper;
import com.mms.model.Users;

/**
 * @author lkh
 *
 */
@RestController
public class UserController {

	@Autowired
	private UsersMapper usersMapper;

    @RequestMapping(value = "/login")
    public Users findUserBySearch(@RequestBody Users user){
    	List<Users> userList = usersMapper.selectUserBySearch(user);
		if(userList != null && userList.size()==1){
			return userList.get(0);
		}else{
			return null;
		}
    }
    
    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
    	PageHelper.startPage(pageNum, pageSize);
        return usersMapper.selectUserBySearch(null);
    }
}