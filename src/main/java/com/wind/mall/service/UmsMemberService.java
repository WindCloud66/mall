package com.wind.mall.service;

import com.wind.mall.common.api.CommonResult;

/**
 * @author HouYongJu
 * @create 2021-12-18 15:11
 */

public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
