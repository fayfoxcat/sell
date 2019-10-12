package org.fox.sell.controller;

import org.fox.sell.entity.ProductCategory;
import org.fox.sell.entity.ProductInfo;
import org.fox.sell.service.ProductCategoryService;
import org.fox.sell.service.ProductInfoService;
import org.fox.sell.vo.ProductInfoVO;
import org.fox.sell.vo.ProductVO;
import org.fox.sell.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author by fairyfox
 * *2019/10/11-20:31
 */
@RestController
@RequestMapping(value = "/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;


    /**
     *
     * @return
     */
    @GetMapping("/list")
    public ResultVO list(){

        //1.查询所有上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        //2.查询类目（一次性查询）：lambda实现
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3.数据拼装
        for (ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
//            productVO.setProductInfoVOList();


        }

        ResultVO resultVO = new ResultVO<>();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(productVO);

        productInfoVO.setProductId("1");
        productInfoVO.setProductName("柠檬奶茶");
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));

        return resultVO;
    }

}
