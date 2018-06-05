package com.cjy.cms.service;

import com.cjy.cms.dao.mapper.UserMapper;
import com.cjy.cms.dao.model.UserVO;

/**
 * 用户service接口
 * @author chenjiaying
 * @date 2018年05月07日 下午 05:25
 */
public interface UserService extends BaseService<UserMapper> {

    /**
     * 获取带book数据的用户
     * @param id
     * @return
     */
    UserVO selectUserWithBook(int id);


}
