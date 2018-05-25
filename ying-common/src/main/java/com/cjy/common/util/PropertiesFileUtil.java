package com.cjy.common.util;

import java.util.ResourceBundle;

/**
 * 配置文件读取工具
 * @author chenjiaying
 * @date 2018年05月24日 下午 05:56
 */
public class PropertiesFileUtil {

    private ResourceBundle resourceBundle = null;

    public PropertiesFileUtil(String bundleFile) {
        this.resourceBundle = ResourceBundle.getBundle(bundleFile);
    }

    public String getValue(String key) {
        if (null == resourceBundle) {
            return null;
        }
        return  resourceBundle.getString(key);
    }
}
