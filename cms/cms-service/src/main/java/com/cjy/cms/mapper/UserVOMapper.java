package com.cjy.cms.mapper;

import com.cjy.cms.model.User;
import com.cjy.cms.model.UserVO;

import java.util.List;
import java.util.Map;

/**
 * 用户mapper
 * @author chenjiaying
 * @date 2018年05月07日 下午 05:47
 */
public interface UserVOMapper extends UserMapper {

    UserVO selectUserWithBook(int id);

    List<User> selectAll(Map<String, Object> map);

    void insertAutoKey(User user);
}
