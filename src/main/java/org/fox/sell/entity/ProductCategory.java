package org.fox.sell.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * 2019/10/10
 */
@Entity
@DynamicUpdate  //实现数据库时间自动更新
@Data   //使用lombok插件及依赖，实现省略Get/Set/toString方法
public class ProductCategory {
    //类目id:设置自增长
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    //类目名字
    private String categoryName;
    //类目编号
    private Integer categoryType;
}
