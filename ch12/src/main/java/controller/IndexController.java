/*
 * Date: 2021/5/14
 * Author: <https://www.github.com/shaozk>
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shaozk
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/login")
    public String login() {
        return "login";//跳转到“/WEB-INF/jsp/login.jsp”
    }
    @RequestMapping("/register")
    public String register() {
        return "register";
    }
}
