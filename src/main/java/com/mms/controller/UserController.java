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
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.mms.mapper.UsersMapper;
import com.mms.model.Users;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author lkh
 *
 */
@Api(tags = "操作用户的api")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UsersMapper usersMapper;
	
	@ApiOperation(value="/login", notes="用户登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/login", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Users findUserBySearch(@RequestBody Users user){
    	List<Users> userList = usersMapper.selectUserBySearch(user);
		if(userList != null && userList.size()==1){
			return userList.get(0);
		}else{
			return null;
		}
    }
    
    @ApiOperation(value="findAllUser", notes="分页查所有用户", produces = "application/json")
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", method=RequestMethod.POST)
    public Object findAllUser(@RequestBody Users user, @PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
    	PageHelper.startPage(pageNum, pageSize);
        return usersMapper.selectUserBySearch(user);
    }
}