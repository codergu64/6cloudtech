package com.cloudtech.controller;

import com.cloudtech.domain.CloudSystem;
import com.cloudtech.domain.TraitContent;
import com.cloudtech.service.IProductService;
import com.cloudtech.service.ITraitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/product")
@Controller
public class ProductController {
    @Resource
    private IProductService iProductService;
    @Resource
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
    @GetMapping("/selectByProductId/{id}")
    public String selectByProducrId(Model model, @PathVariable("id") Integer productId){
        List<TraitContent> traitContents = iTraitService.selectByProductId(productId);
        model.addAttribute("products",traitContents);
        return "product";
    }
    @GetMapping("/p")
    public String product(){
        return "product";
    }
    @GetMapping("/test/{id}")
    @ResponseBody
    public List test(@PathVariable("id") Integer productId){
        List<TraitContent> traitContents = iTraitService.selectByProductId(productId);

        return traitContents;
    }



}
