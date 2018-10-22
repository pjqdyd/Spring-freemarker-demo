package com.pjqdyd.demo.service.impl;

import com.pjqdyd.demo.dao_repository.FormRepository;
import com.pjqdyd.demo.dataobject.MovieForm;
import com.pjqdyd.demo.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 表单业务接口实现类
 */
@Service
public class FormServiceImpl implements FormService {

    @Autowired
    private FormRepository formRepository;

    @Override
    @Transactional
    public MovieForm create(MovieForm movieForm) {
        return formRepository.save(movieForm);
    }

    @Override
    public MovieForm findOne(Integer id) {
        return formRepository.findOne(id);
    }

    @Override
    public Page<MovieForm> findList(String name, Pageable pageable) {
        return formRepository.findByName(name,pageable);
    }

    @Override
    @Transactional
    public void delete(Integer id) {

        formRepository.delete(id);

    }
}
