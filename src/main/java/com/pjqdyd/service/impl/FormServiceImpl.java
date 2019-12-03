package com.pjqdyd.service.impl;

import com.pjqdyd.repository.FormRepository;
import com.pjqdyd.entity.Form;
import com.pjqdyd.service.FormService;
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
    public Form create(Form form) {
        return formRepository.save(form);
    }

    @Override
    public Form findOne(Integer id) {
        return formRepository.findOne(id);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        formRepository.delete(id);
    }

    @Override
    public Page<Form> findList(Pageable pageable) {
        return formRepository.findAll(pageable);
    }
}