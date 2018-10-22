package com.pjqdyd.demo.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 表单的实体类
 */
@Entity
@Data
@DynamicUpdate
@DynamicInsert
public class MovieForm {

    @Id
    @GeneratedValue
    private Integer formId;
    private String name;
    private String age;
    private String sex;
    private String favoriteType;
    private String seenMovie;
    private String evaluate;
    private Date createTime;
    private Date updateTime;

}
