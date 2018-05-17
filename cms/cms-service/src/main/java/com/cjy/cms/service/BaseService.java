package com.cjy.cms.service;

/**
 * baseService接口
 * @author chenjiaying
 * @date 2018年05月07日 下午 04:48
 */
public interface BaseService<Mapper> {

    /**
     * 获取基本操作mapper
     * @return
     */
    Mapper getMapper();
}
