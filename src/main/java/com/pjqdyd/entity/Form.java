package com.pjqdyd.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.util.Date;

/**
 * 表单的实体类
 */
@Entity
@Data
//@DynamicUpdate
//@DynamicInsert
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer formId;

    @Column(unique = true)
    private Integer studentId; //学号

    @Column(unique = true)
    private String username; //用户名

    @JsonIgnore
    private String password; //密码

    private String token; //用户token

    @UpdateTimestamp
    @Column(updatable = false)
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;

}
