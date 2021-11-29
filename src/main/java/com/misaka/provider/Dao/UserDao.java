package com.misaka.provider.Dao;

import com.misaka.Domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface UserDao {
    User SelectById(int id);
    Set<User> Login(String username, String password);
}
