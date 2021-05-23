/*
 * Date: 2021/5/24
 * Author: <https://www.github.com/shaozk>
 */

package service;

import dao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.StudentCourseAndScore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shaozk
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentCourseAndScore> listAllCourseAndScore(String sid) {
//        測試
//        List<StudentCourseAndScore> list = new ArrayList<>();
//        StudentCourseAndScore scas = new StudentCourseAndScore();
//        scas.setCourse("compiler");
//        scas.setSname("shaozk");
//        scas.setSid("1006");
//        scas.setScore(100);
//        list.add(scas);
        return studentMapper.listAllScoreById(sid);
    }
}
