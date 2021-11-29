package com.misaka.provider.ServiceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.misaka.Domain.User;

import com.misaka.Servvicer.UserService;
import com.misaka.provider.Dao.UserDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//暴露
@Component
@Service(interfaceClass = UserService.class,timeout = 30000,version = "1.0.0")
public class UserServiceImp implements UserService {


    //    dao
    @Resource
    UserDao userDao;

    @Override
    public User SelectById(int id) {
        return userDao.SelectById(id);
    }
    @Override
    public Boolean Login(String username, String password) {
        if(userDao.Login(username,password).size()==0){
            return false;
        }else {
            return true;
        }

    }
}
