package com.pjqdyd.demo.controller;

import com.pjqdyd.demo.dao_repository.FormRepository;
import com.pjqdyd.demo.dataobject.MovieForm;
import com.pjqdyd.demo.form.ReceiveForm;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/form")
public class FormController {
    @Autowired
    private FormRepository formRepository;

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("/index");
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid ReceiveForm form,
                             BindingResult bindingResult,
                             Map<String,Object> map){
        if(bindingResult.hasErrors()){
            map.put("msg",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/form/index");
            return new ModelAndView("/result/error");
        }

        MovieForm movieForm = new MovieForm();
        try {
            BeanUtils.copyProperties(form,movieForm);
            formRepository.save(movieForm);
        } catch (Exception e) {
            map.put("msg",e.getMessage());
            map.put("url","/form/index");
            return new ModelAndView("/result/error");
        }

        map.put("url","/form/index");
        return new ModelAndView("/result/success",map);
    }

}
