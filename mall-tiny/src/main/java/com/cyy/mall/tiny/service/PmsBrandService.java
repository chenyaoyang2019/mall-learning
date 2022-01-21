package com.cyy.mall.tiny.service;

import com.cyy.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author: chenyaoyang
 * @date: 2022/1/20 18:06
 * @description: TODO
 **/
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
