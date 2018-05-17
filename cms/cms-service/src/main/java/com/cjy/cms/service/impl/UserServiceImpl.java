package com.cjy.cms.service.impl;

import com.cjy.cms.mapper.UserMapper;
import com.cjy.cms.mapper.UserVOMapper;
import com.cjy.cms.model.User;
import com.cjy.cms.model.UserVO;
import com.cjy.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author chenjiaying
 * @date 2018年05月08日 上午 10:45
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserVOMapper userVOMapper;

    /**
     * 获取基本操作mapper
     * @return
     */
    @Override
    public UserMapper getMapper() {
        return userMapper;
    }

    /**
     * 获取带book数据的用户
     * @param id
     * @return
     */
    @Override
    public UserVO selectUserWithBook(int id) {
        return userVOMapper.selectUserWithBook(id);
    }

    /**
     * 根据条件获取用户列表
     * @param map
     * @return
     */
    @Override
    public List<User> selectAll(Map<String, Object> map) {
        return userVOMapper.selectAll(map);
    }

    /**
     * 插入用户并返回主键
     * @param user
     */
    @Override
    public void insertAutoKey(User user) {
        userVOMapper.insertAutoKey(user);
    }


}
