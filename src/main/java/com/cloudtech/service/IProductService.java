package com.cloudtech.service;

import com.cloudtech.domain.CloudSystem;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 湖人总冠军
 * king.wang
 */

public interface IProductService {
/**
 * 查出产品体系和超弦实验室
 */
    List<CloudSystem> selectAll(Integer type);
}
