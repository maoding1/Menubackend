package com.example.menubackend.service.impl;

import com.example.menubackend.entity.UserEntity;
import com.example.menubackend.dao.UserDao;
import com.example.menubackend.io.exception.BizException;
import com.example.menubackend.io.exception.CommonErrorType;
import com.example.menubackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    /**
     * 用户注册
     * @param uid 账号
     * @param password 密码
     */
    @Override   //TODO
    public boolean register(String uid, String password) {
        boolean existResult = userDao.findByUid(uid) != null;   //存在则值为yes

        if (existResult)
            return false;
        else
        {
            userDao.save(UserEntity.builder().username("null").password(password).uid(uid).build());
            return true;
        }
    }

    /**
     * 根据 uid 查找用户
     * @param uid 账号
     * @return         用户实体
     */
    @Override
    public UserEntity findByUid(String uid) {
        return userDao.findByUid(uid);
    }

    /**
     * 用户登录
     * @param uid 账号
     * @param password 密码
     */
    @Override
    public boolean login(String uid, String password) {
        UserEntity user = userDao.findByUid(uid);
        if (user == null || !password.equals(user.getPassword())) {
            //throw new BizException(BizError.INVALID_CREDENTIAL);
            return false;
        }
        return true;
    }

    /**
     * 编辑用户信息
     * @param username 用户名
     */
    @Override   //TODO
    public void editInfo(String uid, String username){
        UserEntity user = userDao.findByUid(uid);
        if(user == null){
            throw new BizException(CommonErrorType.ILLEGAL_ARGUMENTS, "用户不存在"); //??stop
        }
        userDao.save(user.setUsername(username));
    }
}