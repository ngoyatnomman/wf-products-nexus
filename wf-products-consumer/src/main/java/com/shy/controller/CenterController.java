package com.shy.controller;

import com.shy.service.ProductsService;
import com.shy.service.QualitiesService;
import com.shy.vo.Products;
import com.shy.vo.Qualities;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class CenterController {
    private ProductsService productsService;
    private QualitiesService qualitiesService;

    @Autowired
    public CenterController(ProductsService productsService, QualitiesService qualitiesService) {
        this.productsService = productsService;
        this.qualitiesService = qualitiesService;
    }

    @PostMapping("/showPage.do")
    public PageInfo<Map<String, Object>> showPage(@RequestParam("pageno") Integer pageno, @RequestBody Products products) {
        return productsService.showPage(pageno,products);
    }

    @PostMapping("/addProduct.do")
    public int addProduct(@RequestBody Products products) {
        return productsService.addProduct(products);
    }

    @PostMapping("/updateProduct.do")
    public int updateProduct(@RequestBody Products products) {
        return productsService.updateProduct(products);
    }


    @PostMapping("/editQualities.do")
    public int editQualities(@RequestBody Qualities qualities) {
        return qualitiesService.editQualities(qualities);
    }
}
