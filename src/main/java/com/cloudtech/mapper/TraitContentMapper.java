package com.cloudtech.mapper;

import com.cloudtech.domain.TraitContent;

public interface TraitContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TraitContent record);

    int insertSelective(TraitContent record);

    TraitContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TraitContent record);

    int updateByPrimaryKeyWithBLOBs(TraitContent record);

    int updateByPrimaryKey(TraitContent record);
}