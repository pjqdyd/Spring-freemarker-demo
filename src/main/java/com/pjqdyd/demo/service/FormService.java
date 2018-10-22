package com.pjqdyd.demo.service;

import com.pjqdyd.demo.dataobject.MovieForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 表单业务操作相关接口
 */
public interface FormService {

    //创建表单
    MovieForm create(MovieForm movieForm);

    //通过form_id查询表单
    MovieForm findOne(Integer id);

    //通过name分页查询
    Page<MovieForm> findList(String name, Pageable pageable);

    //通过form_id删除表单
    void delete(Integer id);

}
