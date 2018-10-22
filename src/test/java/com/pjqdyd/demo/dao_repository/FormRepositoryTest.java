package com.pjqdyd.demo.dao_repository;

import com.pjqdyd.demo.dataobject.MovieForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * 数据访问测试
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FormRepositoryTest {

    @Autowired
    private FormRepository formRepository;

    @Test
    public void saveTest() throws Exception{

        MovieForm movieForm = new MovieForm();
        movieForm.setName("王境泽");
        movieForm.setAge("12");
        movieForm.setSex("男生");
        movieForm.setFavoriteType("飓风等级的,sdh");
        movieForm.setSeenMovie("就看到hsjfh");
        movieForm.setEvaluate("s海底隧道");

        MovieForm result = formRepository.save(movieForm);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOneTest() throws Exception{
        MovieForm result = formRepository.findOne(1);
        Assert.assertNotNull(result);
    }

    @Test
    public void findAllTest() throws Exception{
        List<MovieForm> movieFormList = formRepository.findAll();
        Assert.assertNotEquals(0,movieFormList.size());
    }

    @Test
    public void findByName() throws Exception{
        PageRequest pageRequest = new PageRequest(0,3);
        Page<MovieForm> result = formRepository.findByName("王境泽",pageRequest);
        Assert.assertNotEquals(0,result.getTotalElements());
        System.out.println(result.getTotalElements());
    }

    @Test
    public void delete() throws Exception{
        formRepository.delete(2);
    }

}