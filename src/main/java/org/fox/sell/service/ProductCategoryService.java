package org.fox.sell.service;

import org.fox.sell.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    /**
     * 后台：根据类目Id查询单个类目
     * @param categoryId
     * @return
     */
    public ProductCategory findOne(Integer categoryId);

    /**
     * 后台：查询所有类目，返回类目列表
     * @return
     */
    public List<ProductCategory> findAll();

    /**
     * 前台：根据类 目类别列表 返回 类目列表
     * @param categoryTypeList
     * @return
     */
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 后台：新增类目
     * @param productCategory
     * @return
     */
    public ProductCategory save(ProductCategory productCategory);
}
