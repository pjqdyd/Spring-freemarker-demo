package com.pjqdyd.service;

import com.pjqdyd.entity.Form;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 表单业务操作相关接口
 */
public interface FormService {

    //创建表单
    Form create(Form form);

    //通过form_id查询表单
    Form findOne(Integer id);

    //分页查询所有表单
    Page<Form> findList(Pageable pageable);

    //通过form_id删除表单
    void delete(Integer id);

}