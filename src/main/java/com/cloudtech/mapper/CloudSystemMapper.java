package com.cloudtech.mapper;

import com.cloudtech.domain.CloudSystem;

public interface CloudSystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CloudSystem record);

    int insertSelective(CloudSystem record);

    CloudSystem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CloudSystem record);

    int updateByPrimaryKey(CloudSystem record);
}