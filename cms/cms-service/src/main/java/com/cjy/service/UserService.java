package com.cjy.service;

import com.cjy.mapper.UserMapper;
import com.cjy.model.User;
import com.cjy.model.UserVO;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据条件获取用户列表
     * @param map
     * @return
     */
    List<User> selectAll(Map<String, Object> map);

    /**
     * 插入用户并返回主键
     * @param user
     */
    void insertAutoKey(User user);

}
