package com.pjqdyd.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 注册接收表单的类
 */
@Data
public class RegisterForm {

    @NotNull
    private Integer studentId; //学号

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
