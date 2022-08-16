package com.macro.mall.tiny.nosql.elasticsearch.repository;

import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @class: EsProductRepository
 * @description: 商品es操作类
 * @author: cyy
 * @create: 2022-08-10 22:13
 **/
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    /**
     * 搜索查询
     * @param name          商品名称
     * @param subTitle      商品标题
     * @param keywords      商品关键字
     * @return              分页信息
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable pageable);
}
