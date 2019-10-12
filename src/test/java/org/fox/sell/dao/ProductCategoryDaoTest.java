package org.fox.sell.dao;

import org.fox.sell.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = productCategoryDao.findById(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(2);
        productCategory.setCategoryName("受欢迎");
        productCategory.setCategoryType(4);
        productCategoryDao.save(productCategory);
    }

}