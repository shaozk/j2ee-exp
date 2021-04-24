/*
 * Date: 2021/4/24
 * Author: <https://www.github.com/shaozk>
 */

package pojo;

import com.mysql.jdbc.Blob;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * TODO
 *
 * @author shaozk
 */
@Getter
@Setter
public class MUser implements Serializable {

    private int userID;
    private String userName;
    private String userSex;
    private Date userBirthday;
    private Byte[] userPhoto;
    private String userResume;

    @Override
    public String toString() {
        return "MUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirthday=" + userBirthday +
                ", userPhoto=" + Arrays.toString(userPhoto) +
                ", userResume='" + userResume + '\'' +
                '}';
    }

}
