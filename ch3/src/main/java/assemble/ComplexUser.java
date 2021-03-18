/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package assemble;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author shaozk
 * @Description: 基于XML配置的Bean的装配方式
 */
public class ComplexUser {
    private String uname;
    private List<String> hobbyList;
    private Map<String, String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;

    /**
     * 使用构造方法注入，需要提供带参的构造方法
     * @param uname
     * @param hobbyList
     * @param residenceMap
     * @param aliasSet
     * @param array
     */
    public ComplexUser(String uname, List<String> hobbyList, Map<String, String> residenceMap, Set<String> aliasSet, String[] array) {
        super();
        this.uname = uname;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }

    /**
     * 使用属性的setter方法注入，提供默认无参的构造方法，并为注入的属性提供setter方法
     */

    public ComplexUser() {
        super();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public Map<String, String> getResidenceMap() {
        return residenceMap;
    }

    public void setResidenceMap(Map<String, String> residenceMap) {
        this.residenceMap = residenceMap;
    }

    public Set<String> getAliasSet() {
        return aliasSet;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "uname=" + uname + ";hobbyList=" + hobbyList + ";residenceMap=" + residenceMap + ";aliasSet=" + aliasSet + ";array=" + array + ";";
    }
}
