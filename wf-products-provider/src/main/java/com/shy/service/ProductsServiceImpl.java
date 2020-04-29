package com.shy.service;

import com.shy.mapper.ProductsMapper;
import com.shy.mapper.QualitiesMapper;
import com.shy.vo.Products;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

/**
 * 产品一方
 * */
@Service
@Transactional
public class ProductsServiceImpl  implements ProductsService{

    private ProductsMapper productsMapper;
    private QualitiesMapper qualitiesMapper;

    @Autowired
    public ProductsServiceImpl(ProductsMapper productsMapper, QualitiesMapper qualitiesMapper) {
        this.productsMapper = productsMapper;
        this.qualitiesMapper = qualitiesMapper;
    }

    /**
     * 使用分页插件做分页或查询所有
     * */
    @Override
    public PageInfo<Map<String,Object>> showPage(Integer pageno, Products products){
        PageHelper.startPage(pageno, 3);
        List<Map<String, Object>> list = productsMapper.showPage(products);
        return new PageInfo<>(list);
    }

    @Override
    public int addProduct(Products products){
        int num = productsMapper.addProduct(products);
        if(num > 0){
            num = qualitiesMapper.addQualities(products.getId());
        }
        return num;
    }

    @Override
    public int updateProduct(Products products){
        return productsMapper.updateProduct(products);
    }


}
