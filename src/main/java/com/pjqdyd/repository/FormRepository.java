package com.pjqdyd.repository;

import com.pjqdyd.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 表单数组资源仓库(DAO层数据持久访问对象)
 */
public interface FormRepository extends JpaRepository<Form,Integer> {

    Form findFormByUsernameEqualsAndAndPasswordEquals(String username, String password);

}
