package com.pjqdyd.demo.dao_repository;

import com.pjqdyd.demo.dataobject.MovieForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 表单数组资源仓库(DAO层数据持久访问对象)
 */
public interface FormRepository extends JpaRepository<MovieForm,Integer> {

    //按名字分页查找的方法
    Page<MovieForm> findByName(String name, Pageable pageable);
}
