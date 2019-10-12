package org.fox.sell.dao;

import org.fox.sell.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author by fairyfox
 * 2019/10/11-10:10
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo,Integer> {

     List<ProductInfo> findByProductStatus(Integer productStatus);
}
