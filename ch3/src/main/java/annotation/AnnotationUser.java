/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shaozk
 * @Description: 基于注解的装配
 */
@Component()    // 相当与@Compoent("AnnotationUser")或@Component(value="AnnotationUser")
public class AnnotationUser {
    @Value("shaozk")    // 只注入简单的值，对于复杂值得注入目前使用该方法解决不了
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
