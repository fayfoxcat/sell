package org.fox.sell.service;

import org.fox.sell.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author by fairyfox
 * 2019/10/11-10:16
 */
public interface ProductInfoService {

    /**
     * 根据 商品id 返回单个商品信息
     * @param productId
     * @return
     */
    public ProductInfo findOne(Integer productId);

    /**
     * 查询所有上架商品列表
     * @return
     */
    public List<ProductInfo> findUpAll();

    /**
     * 分页查询所有商品，返回商品列表
     * @param pageable
     * @return
     */
    public Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 新增商品
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);
}
