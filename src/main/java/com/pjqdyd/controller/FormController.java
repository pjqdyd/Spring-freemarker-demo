package com.pjqdyd.controller;

import com.pjqdyd.entity.Form;
import com.pjqdyd.entity.LoginForm;
import com.pjqdyd.entity.RegisterForm;
import com.pjqdyd.service.FormService;
import org.springframework.beans.BeanUtils;
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
    private FormService formService;

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("/index");
    }

    /**
     * 注册接口
     */
    @PostMapping("/register")
    public ModelAndView register(@Valid RegisterForm form, BindingResult bindingResult, Map<String,Object> map){
        if(bindingResult.hasErrors()){
            map.put("msg",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/form/index");
            return new ModelAndView("/result/error");
        }
        Form newForm = new Form();
        try {
            BeanUtils.copyProperties(form,newForm);
            formService.create(newForm);
        } catch (Exception e) {
            map.put("msg",e.getMessage());
            map.put("url","/form/index");
            return new ModelAndView("/result/error");
        }

        map.put("url","/admin/form/list");
        System.out.println(form.toString());
        return new ModelAndView("/result/success", map);
    }

    /**
     * 登录接口
     */
    @PostMapping("/login")
    public ModelAndView login(@Valid LoginForm loginForm, BindingResult bindingResult, Map<String,Object> map){
        if(bindingResult.hasErrors()){
            map.put("msg",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/form/index");
            return new ModelAndView("/result/error");
        }
        Form form = formService.login(loginForm.getUsername(), loginForm.getPassword());
        if (form == null){
            map.put("msg", "用户名不存在, 或密码错误");
            map.put("url","/form/index");
            return new ModelAndView("/result/error");
        }

        map.put("url","/admin/form/list");
        System.out.println(form.toString());
        return new ModelAndView("/result/success", map);
    }

}
