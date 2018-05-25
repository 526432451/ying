package com.cjy.cms.controller.cms;

import com.cjy.cms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


/**
 * 文章类目
 * @author chenjiaying
 * @date 2018年05月25日 上午 11:47
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    private static Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private UserService userService;

    /**
     * 首页
     * @return
     */
    @RequestMapping(value = {""})
    public String index() {
        return "redirect:/category/list";
    }

    @RequestMapping("/list")
    public String list(
            @RequestParam(required = false, defaultValue = "1") int Page,
            @RequestParam(required = false, defaultValue = "20") int rows,
            HttpServletRequest request) {
        return "/category/list";
    }
}
