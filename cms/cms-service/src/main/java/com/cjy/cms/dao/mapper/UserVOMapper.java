package com.cjy.cms.dao.mapper;

import com.cjy.cms.dao.model.UserVO;

/**
 * 用户mapper
 * @author chenjiaying
 * @date 2018年05月07日 下午 05:47
 */
public interface UserVOMapper extends UserMapper {

    UserVO selectUserWithBook(int id);

}
