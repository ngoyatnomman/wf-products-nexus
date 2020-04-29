package com.shy.service;

import com.github.pagehelper.PageInfo;
import com.shy.vo.Products;
import java.util.Map;

/**
 * 产品一方
 * */
public interface ProductsService {

    /**
     * 使用分页插件做分页或查询所有
     * */
    PageInfo<Map<String,Object>> showPage(Integer pageno, Products products);

    int addProduct(Products products);

    int updateProduct(Products products);
}
