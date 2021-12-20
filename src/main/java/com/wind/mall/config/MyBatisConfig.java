package com.wind.mall.config;

import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan({"com.wind.mall.mbg.mapper","com.wind.mall.dao"})
public class MyBatisConfig {
}