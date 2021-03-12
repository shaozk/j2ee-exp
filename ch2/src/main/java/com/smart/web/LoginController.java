/*
 * Date: 2021/3/12
 * Author: <https://www.github.com/shaozk>
 */

package com.smart.web;

import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author shaozk
 * @Description: TODO
 */
@Transactional
public class LoginController {
    private UserService userService;

    @RequestMapping(value = "/index.html")
    public String loginPage(){
        return "/login.jsp";
    }

    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand){
        boolean isValidUser =  userService.hasMatchUser(loginCommand.getUserName(),loginCommand.getPassword());
        if (!isValidUser) {
            return new ModelAndView("/login.jsp", "error", "用户名或密码错误。");
        } else {
            User user = userService.findUserByUserName(loginCommand.getUserName());
            user.setLastIp(request.getLocalAddr());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
