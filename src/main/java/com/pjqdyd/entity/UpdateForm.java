package com.pjqdyd.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 更新接收的表单的类
 */
@Data
public class UpdateForm {

    @NotNull
    private Integer formId;

    @NotNull
    private Integer studentId; //学号

    @NotBlank
    private String username;

}
