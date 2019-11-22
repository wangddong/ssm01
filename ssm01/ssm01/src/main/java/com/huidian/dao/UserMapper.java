package com.huidian.dao;

import com.huidian.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {

    List<User> queryAllUser();
}
