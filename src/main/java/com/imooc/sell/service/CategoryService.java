package com.imooc.sell.service;
/**
 * @Author squareface
 * @Description //TODO 买家业务的接口
 * @Date 15:05 2019-03-27
 * @Param
 * @return
 **/
import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

    }
