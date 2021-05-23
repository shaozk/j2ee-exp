/*
 * Date: 2021/5/24
 * Author: <https://www.github.com/shaozk>
 */

package dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pojo.StudentCourseAndScore;

import java.util.List;

/**
 * @author shaozk
 */
@Mapper
@Repository
public interface StudentMapper {
    /**
     * 通过学生id查询成绩
     * @param sid
     */
    public List<StudentCourseAndScore> listAllScoreById(String sid);
}
