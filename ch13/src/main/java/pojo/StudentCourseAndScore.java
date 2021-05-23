/*
 * Date: 2021/5/24
 * Author: <https://www.github.com/shaozk>
 */

package pojo;


import lombok.Data;

/**
 * 同时含有课程和分数信息的pojo
 * @author shaozk
 */
@Data
public class StudentCourseAndScore {
    private String sid;
    private String sname;
    private String course;
    private String score;
}
