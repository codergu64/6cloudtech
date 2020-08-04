package com.cloudtech.mapper;

import com.cloudtech.domain.TraitContent;

import java.util.List;

public interface TraitContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TraitContent record);

    int insertSelective(TraitContent record);

    TraitContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TraitContent record);

    int updateByPrimaryKeyWithBLOBs(TraitContent record);

    int updateByPrimaryKey(TraitContent record);

    /**
     * 根据lab_id查询
     */
    List<TraitContent> selectByLabId(Integer labId);
    /**
     * 根据product_id查询
     */
    List<TraitContent> selectByProductId(Integer productId);
}