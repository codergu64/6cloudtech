package com.cloudtech.service.impl;

import com.cloudtech.domain.CloudSystem;
import com.cloudtech.mapper.CloudSystemMapper;
import com.cloudtech.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 湖人总冠军
 * king.wang
 */

@Service
public class ProductServiceImpl implements IProductService {
    @Resource
    private CloudSystemMapper cloudSystemMapper;
    @Override
    public List<CloudSystem> selectAll(Integer type) {
        List<CloudSystem> productAll = cloudSystemMapper.selectProductAll(type);
        return productAll;

    }

    @Override
    public List<CloudSystem> selectByLabId(Integer labId) {
        List<CloudSystem> selectByLabId = cloudSystemMapper.selectByLabId(labId);
        return selectByLabId;
    }

    @Override
    public List<CloudSystem> selectByProductId(Integer productId) {
        List<CloudSystem> selectByProductId = cloudSystemMapper.selectByProductId(productId);
        return selectByProductId;
    }
}
