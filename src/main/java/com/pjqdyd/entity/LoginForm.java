package com.pjqdyd.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 登录接收表单的类
 */
@Data
public class LoginForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
