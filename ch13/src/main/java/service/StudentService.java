/*
 * Date: 2021/5/24
 * Author: <https://www.github.com/shaozk>
 */

package service;

import pojo.StudentCourseAndScore;

import java.util.List;

/**
 * @author shaozk
 */
public interface StudentService {
    List<StudentCourseAndScore> listAllCourseAndScore(String sid);
}
