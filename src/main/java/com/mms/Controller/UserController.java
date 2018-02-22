/**
 * project : mms-web
 * package : com.mms.Controller
 * fileName: UserController.java
 * createAt:2018年2月9日 上午6:05:06
 * createBy:lkh
 */
package com.mms.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mms.model.Users;
import com.mms.service.UserService;

/**
 * @author lkh
 *
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String findUserBySearch(@RequestBody Users user){
    	Users users = userService.findUserBySearch(user);
    	return null == users?"2":"1";
    }
    
    @RequestMapping(value = "/register" )
    public int addUser(@RequestBody Users user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
}