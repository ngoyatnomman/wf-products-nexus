package com.shy.mapper;

import com.shy.vo.Products;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 产品一方
 * */
@Component
public interface ProductsMapper {

    /**
     * 使用分页插件做分页或查询所有
     * */
    List<Map<String,Object>> showPage(Products products);

    @Insert("INSERT INTO products (productname, productdate, productsum, productdesc, productprice) VALUES (#{productname},#{productdate}, #{productsum}, #{productdesc}, #{productprice})")
    int addProduct(Products products);

    @Update("UPDATE products SET productsum = #{productsum}, productdesc = #{productdesc}, productprice = #{productprice} WHERE id = #{id}")
    int updateProduct(Products products);
}
