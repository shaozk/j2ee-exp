/*
 * Date: 2021/5/24
 * Author: <https://www.github.com/shaozk>
 */

package controller;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.StudentCourseAndScore;
import service.StudentService;

import java.util.List;

/**
 * @author shaozk
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 获取学生成绩通过sid
     * @param sid
     * @return
     */
    @RequestMapping(value = "scoreList", method = RequestMethod.GET)
    public ModelAndView scoreList(@RequestParam(name = "sid", required = true) String sid) {
        ModelAndView modelAndView = new ModelAndView();
        List<StudentCourseAndScore> scoreList = studentService.listAllCourseAndScore(sid);
        modelAndView.addObject("scoreList", scoreList);
        modelAndView.setViewName("scoreList");
        return modelAndView;
    }

    /**
     * 一个测试方法
     * @return
     */
    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView view = new ModelAndView();
        String str = new String("hello");
        view.addObject("str", str);
        view.setViewName("test");
        return view;
    }
}
