package com.pjqdyd.service.impl;

import com.pjqdyd.entity.UpdateForm;
import com.pjqdyd.repository.FormRepository;
import com.pjqdyd.entity.Form;
import com.pjqdyd.service.FormService;
import org.springframework.beans.BeanUtils;
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
    public Form login(String username, String password) {
        return formRepository.findFormByUsernameEqualsAndAndPasswordEquals(username, password);
    }

    @Override
    public Form findOne(Integer id) {
        return formRepository.findOne(id);
    }

    @Override
    @Transactional
    public Form delete(Integer id) {
        Form form = formRepository.findOne(id);
        if (form != null){
            formRepository.delete(id);
            return form;
        }
        return null;
    }

    @Override
    public Page<Form> findList(Pageable pageable) {
        return formRepository.findAll(pageable);
    }
    @Override
    public Form update(UpdateForm updateForm) {
        Form form = formRepository.findOne(updateForm.getFormId());
        if (form != null){
            form.setUsername(updateForm.getUsername());
            form.setStudentId(updateForm.getStudentId());
            return formRepository.save(form);
        }
        return null;
    }
}
