package com.cloudtech.service.impl;

import com.cloudtech.domain.TraitContent;
import com.cloudtech.mapper.TraitContentMapper;
import com.cloudtech.service.ITraitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 湖人总冠军
 * king.wang
 */
@Service
public class ITraitServicrImpl implements ITraitService {

    @Resource
    private TraitContentMapper traitContentMapper;

    @Override
    public List<TraitContent> selectByLabId(Integer labId) {
        List<TraitContent> labTraitContent = traitContentMapper.selectByLabId(labId);
        return labTraitContent;
    }

    @Override
    public List<TraitContent> selectByProductId(Integer productId) {
        List<TraitContent> productTraitContents = traitContentMapper.selectByProductId(productId);
        return productTraitContents;
    }
}
