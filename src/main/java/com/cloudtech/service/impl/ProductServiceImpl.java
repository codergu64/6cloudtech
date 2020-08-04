package com.cloudtech.service.impl;

import com.cloudtech.domain.CloudSystem;
import com.cloudtech.mapper.CloudSystemMapper;
import com.cloudtech.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 湖人总冠军
 * king.wang
 */
public class ProductServiceImpl implements IProductService {
    @Autowired
    private CloudSystemMapper cloudSystemMapper;
    @Override
    public List<CloudSystem> selectAll(int type) {
        List<CloudSystem> productAll = cloudSystemMapper.selectProductAll(type);
        return productAll;

    }
}