package com.java.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.UserMapper;
import com.java.entity.User;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
    private UserMapper userDao;  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }

}