package com.cloudtech.service;

import com.cloudtech.domain.TraitContent;

import java.util.List;

/**
 * 湖人总冠军
 * king.wang
 */
public interface ITraitService {
    /**
     * 根据labId查询
     */
    List<TraitContent> selectByLabId(Integer labId);
    /**
     * 根据productId查询
     */
    List<TraitContent> selectByProductId(Integer productId);
}
