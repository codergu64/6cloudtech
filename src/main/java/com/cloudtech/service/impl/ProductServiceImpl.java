package com.cloudtech.service.impl;

import com.cloudtech.domain.CloudSystem;
import com.cloudtech.mapper.CloudSystemMapper;
import com.cloudtech.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
