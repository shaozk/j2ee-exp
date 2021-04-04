/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package pojo;

/**
 * @author shaozk
 * @Description: TODO
 */
public class MyUser {
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                '}';
    }

    private Integer uid;
    private String uname;
    private String usex;

}
