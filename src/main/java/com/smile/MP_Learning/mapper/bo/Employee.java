package com.smile.MP_Learning.mapper.bo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @author smi1e
 * Date 2019/11/6 16:46
 * Description
 */
@Data
@TableName("tbl_employee")
public class Employee extends Model<Employee> {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer age;
}
