package com.cjy.cms.controller;

import com.cjy.model.User;
import com.cjy.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 示例controller
 * @author chenjiaying
 * @date 2018年05月10日 下午 02:55
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("/index")
    public String index() {
        // 视图渲染，/WEB-INF/jsp/hello/world.jsp
        return "/hello/world";
    }

    // 方法级别的RequestMapping， 限制并缩小了URL路径匹配，同类级别的标签协同工作，最终确定拦截到的URL由那个方法处理
    @RequestMapping("/world")
    public String world() {
        // 视图渲染，/WEB-INF/jsp/hello/world.jsp
        return "/hello/world";
    }

    // 本方法将处理 /hello/view?courseId=123 形式的URL
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Model model) {
        User user = userService.getMapper().selectByPrimaryKey(courseId);
        model.addAttribute(user);
        return "/course_overview";
    }


}
