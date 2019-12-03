package com.pjqdyd.service.impl;

import com.pjqdyd.entity.Form;
import com.pjqdyd.service.FormService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class FormServiceImplTest {

    @Autowired
    private FormService formService;

    @Test
    public void create() {
        Form form = formService.findOne(4);
        form.setPassword("dddddd");
        formService.create(form);
    }

}