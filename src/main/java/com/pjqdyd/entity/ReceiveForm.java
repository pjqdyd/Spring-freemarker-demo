package com.pjqdyd.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 接收表单的类
 */
@Data
public class ReceiveForm {

    @NotBlank
    private Integer studentId; //学号

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
