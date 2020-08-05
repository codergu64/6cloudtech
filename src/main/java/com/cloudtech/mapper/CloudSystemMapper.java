package com.cloudtech.mapper;

import com.cloudtech.domain.CloudSystem;

import java.util.List;

public interface CloudSystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CloudSystem record);

    int insertSelective(CloudSystem record);

    CloudSystem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CloudSystem record);

    int updateByPrimaryKey(CloudSystem record);

    /**
     * 查出产品体系 超弦实验室
     * @return
     */
    List<CloudSystem> selectProductAll(Integer type);
    List<CloudSystem> selectByLabId(Integer labId);
    List<CloudSystem> selectByProductId(Integer productId);

}