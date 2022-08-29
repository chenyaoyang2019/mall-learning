package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @class: EsProductDao
 * @description: 搜索系统中的商品管理自定义dao
 * @author: cyy
 * @create: 2022-08-10 22:27
 **/
public interface EsProductDao {

    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
