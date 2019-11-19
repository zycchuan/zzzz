package com.zyc.service;

import com.zyc.bean.User;

public interface UserService {

    void add(User user);

    User selectAll(Integer id);

}
