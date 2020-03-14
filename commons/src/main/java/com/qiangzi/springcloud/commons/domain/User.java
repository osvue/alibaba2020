package com.qiangzi.springcloud.commons.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

@Data
@TableName(value = "user")
public class User implements Serializable {
    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;

    @TableField(value = "username")
    private String username;

    @TableField(value = "userpwd")
    private String userpwd;

    @TableField(value = "sex")
    private String sex;

    @TableField(value = "address")
    private String address;

    private static final long serialVersionUID = 1L;

    public static final String COL_USERID = "userid";

    public static final String COL_USERNAME = "username";

    public static final String COL_USERPWD = "userpwd";

    public static final String COL_SEX = "sex";

    public static final String COL_ADDRESS = "address";
}