package com.pjqdyd.demo.service.impl;

import com.pjqdyd.demo.dao_repository.FormRepository;
import com.pjqdyd.demo.dataobject.MovieForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FormServiceImplTest {

    @Autowired
    private FormServiceImpl formService;

    @Test
    public void findList() {
        PageRequest pageRequest = new PageRequest(0,3);
        Page<MovieForm> movieForms = formService.findList(pageRequest);
        Assert.assertNotEquals(0,movieForms.getTotalElements());
    }
}