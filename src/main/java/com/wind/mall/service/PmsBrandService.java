package com.wind.mall.service;

import com.wind.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author HouYongJu
 * @create 2021-12-17 16:36
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
