package com.cjy.cms.service.impl;

import com.cjy.cms.dao.mapper.UserMapper;
import com.cjy.cms.dao.mapper.UserVOMapper;
import com.cjy.cms.dao.model.UserVO;
import com.cjy.cms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenjiaying
 * @date 2018年05月08日 上午 10:45
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static Logger _log = LoggerFactory.getLogger(UserServiceImpl.class);

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
    @Cacheable(value="ehcache")
    public UserVO selectUserWithBook(int id) {
        return userVOMapper.selectUserWithBook(id);
    }


}
