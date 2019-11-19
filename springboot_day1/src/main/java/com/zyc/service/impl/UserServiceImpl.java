package com.zyc.service.impl;

import com.zyc.bean.User;
import com.zyc.mapper.UserMapper;
import com.zyc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User selectAll(Integer id) {
        return userMapper.selectAll(id);
    }
}
