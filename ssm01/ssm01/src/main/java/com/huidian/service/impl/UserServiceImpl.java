package com.huidian.service.impl;

import com.huidian.dao.UserMapper;
import com.huidian.domain.User;
import com.huidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.queryAllUser();
    }

    @Override
    public double yearSalToal(String empno) {
        return 0;
    }
}
