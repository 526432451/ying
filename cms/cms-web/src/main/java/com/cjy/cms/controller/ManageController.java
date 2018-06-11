package com.cjy.cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台controller
 * @author chenjiaying
 * @date 2018年06月06日 下午 02:54
 */
@Controller
@RequestMapping("/manage")
public class ManageController {

    private static Logger _log = LoggerFactory.getLogger(ManageController.class);

    @RequestMapping(value = {"","/index"})
    public Object index(){
        return "/manage/index";
    }

    @RequestMapping("/login")
    public Object login(){
        return "/manage/login";
    }
}
