package com.cloudtech.controller;

import com.cloudtech.domain.CloudSystem;
import com.cloudtech.domain.TraitContent;
import com.cloudtech.service.IProductService;
import com.cloudtech.service.ITraitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private IProductService iProductService;
    private ITraitService iTraitService;
    /**
     * 查询产品体系 实验室类型
     * @param type
     * @return
     */
    @GetMapping("/products")
    @ResponseBody
    public List<CloudSystem> selectAll(Integer type) {
        List<CloudSystem> cloudSystems = iProductService.selectAll(type);
        return cloudSystems;
    }

    /**
     * 根据labId查询
     * @param labId
     * @return
     */
    @GetMapping("/selectByLabId")
    @ResponseBody
    public List<TraitContent> selectByLabId(Integer labId){
        List<TraitContent> traitContents = iTraitService.selectByLabId(labId);
        return traitContents;
    }

    /**
     * 根据productid查询
     * @param productId
     * @return
     */
    @GetMapping("/selectByProductId")
    @ResponseBody
    public List<TraitContent> selectByProducrId(Integer productId){
        List<TraitContent> traitContents = iTraitService.selectByProductId(productId);
        return traitContents;
    }



}
