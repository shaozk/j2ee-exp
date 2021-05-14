/*
 * Date: 2021/5/14
 * Author: <https://www.github.com/shaozk>
 */

package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.UserForm;
import service.UserService;

import javax.servlet.http.HttpSession;

/**
 * @author shaozk
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //得到一个用来记录日志的对象，这样打印信息的时候能够标记打印的是那个类的信息
    private static final Log logger = LogFactory.getLog(UserController.class);
    //将服务依赖注入到属性userService
    @Autowired
    public UserService userService;
    /**
     * 处理登录
     */
    @RequestMapping("/login")
    public String login(UserForm user, HttpSession session, Model model) {
        if(userService.login(user)){
            session.setAttribute("u", user);
            logger.info("成功");
            return "main";//登录成功，跳转到main.jsp
        }else{
            logger.info("失败");
            model.addAttribute("messageError", "用户名或密码错误");
            return "login";
        }
    }
    /**
     *处理注册
     */
    @RequestMapping("/register")
    public String register(@ModelAttribute("user") UserForm user) {
        if(userService.register(user)){
            logger.info("成功");
            return "login";//注册成功，跳转到login.jsp
        }else{
            logger.info("失败");
            //使用@ModelAttribute("user")与model.addAttribute("user", user)功能相同
            //在register.jsp页面上可以使用EL表达式${user.uname}取出ModelAttribute的uname值
            return "register";//返回register.jsp
        }
    }
}
