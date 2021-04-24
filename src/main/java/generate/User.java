package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer userId;

    private String userName;

    /**
     * 0表示男，1表示女
     */
    private String userSex;

    private Date userBirthday;

    private String userResume;

    private byte[] userPhoto;

    private static final long serialVersionUID = 1L;
}