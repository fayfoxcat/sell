package org.fox.sell.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * @Author by fairyfox
 * *2019/10/11-9:57
 */
@Entity
@DynamicUpdate
@Data
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    //商品名
    private String productName;

    //单价
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //缩略图
    private String productIcon;

    //状态：0-正常；1-下架
    private Integer productStatus;

    //类目编号
    private Integer categoryType;
}
