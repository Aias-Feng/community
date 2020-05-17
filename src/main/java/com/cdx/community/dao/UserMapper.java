package com.cdx.community.dao;

import com.cdx.community.model.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByToken(String token);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}