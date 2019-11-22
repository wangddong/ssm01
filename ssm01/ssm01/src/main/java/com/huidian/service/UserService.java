package com.huidian.service;

import com.huidian.domain.User;

import java.util.List;

public interface UserService {
    //查询所有
    List<User> getAll();
    double yearSalToal(String empno);
}
