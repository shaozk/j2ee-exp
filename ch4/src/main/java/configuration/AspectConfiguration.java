/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author shaozk
 * @Description: TODO
 */
@EnableAspectJAutoProxy()
@Configuration
@ComponentScan(basePackages="aspect.annotation")
@ComponentScan(basePackages="dynamic.jdk")
public class AspectConfiguration {
}
