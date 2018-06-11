package com.cjy.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 资源文件读取工具
 * @author chenjiaying
 * @date 2018年06月06日 下午 02:40
 */
public class SpringContextUtil implements ApplicationContextAware{

    public static SpringContextUtil springContextUtil = new SpringContextUtil();

    private static ApplicationContext context = null;

    public final static synchronized SpringContextUtil getInstance() {
        return springContextUtil;
    }
    private SpringContextUtil() {
        super();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static Object getBean(String name) {
        return context.getBean(name);
    }
}
