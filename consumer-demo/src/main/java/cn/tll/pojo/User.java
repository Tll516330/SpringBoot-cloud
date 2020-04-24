package cn.tll.pojo;

import lombok.Data;
import java.util.Date;

/**
 * @author tll
 * @date 2020/4/24
 */
@Data
public class User {
    /**
     * id 主键 自增长
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别 1 男  2 女
     */
    private Integer sex;

    /**
     *出生日期
     */
    private Date birthday;

    /**
     * 备注
     */
    private String remark;

    /**
     *创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date modifytime;
}
