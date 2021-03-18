/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package annotation.controller;

import annotation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author shaozk
 * @Description: TODO
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    public void save() {
        testService.save();
        System.out.println("TestController save()");
    }
}
