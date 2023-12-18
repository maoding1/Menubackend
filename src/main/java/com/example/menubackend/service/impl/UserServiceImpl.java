package com.example.menubackend.service.impl;

import com.example.menubackend.entity.UserEntity;
import com.example.menubackend.dao.UserDao;
import com.example.menubackend.io.exception.BizError;
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
     * @param username 用户名
     * @param password 密码
     */
    @Override   //TODO
    public void register(String username, String password) {
        Long uid = userDao.findAll().size()+base;

        userDao.save(UserEntity.builder().username(username).password(password)
                .uid(uid).build());
    }

    /**
     * 根据 uid 查找用户
     * @param uid 账号
     * @return         用户实体
     */
    @Override   //TODO
    public UserEntity findByUid(Long uid) {
        return userDao.findByUid(uid);
    }

    /**
     * 用户登录
     * @param uid 账号
     * @param password 密码
     */
    @Override
    public void login(Long uid, String password) {
        UserEntity user = userDao.findByUid(uid);
        if (user == null || !password.equals(user.getPassword())) {
            throw new BizException(BizError.INVALID_CREDENTIAL);
        }
    }

    /**
     * 编辑用户信息
     * @param username 用户名
     */
    @Override   //TODO
    public void editInfo(Long uid, String username){
        UserEntity user = userDao.findByUid(uid);
        if(user == null){
            throw new BizException(CommonErrorType.ILLEGAL_ARGUMENTS, "用户不存在");
        }
        userDao.save(user.setUsername(username));
    }
}