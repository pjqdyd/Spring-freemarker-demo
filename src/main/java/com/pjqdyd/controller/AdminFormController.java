package com.pjqdyd.controller;

import com.pjqdyd.entity.Form;
import com.pjqdyd.entity.LoginForm;
import com.pjqdyd.entity.UpdateForm;
import com.pjqdyd.service.impl.FormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

/**
 * 管理表单Controller
 */
@Controller
@RequestMapping("/admin/form")
public class AdminFormController {
    @Autowired
    private FormServiceImpl formService;

    /**
     * 用户列表
     * @param page
     * @param size
     * @param map
     * @return
     */
    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "10") Integer size,
                             Map<String,Object> map){
        PageRequest pageRequest = new PageRequest(page-1,size);
        Page<Form> formPage = formService.findList(pageRequest);
        map.put("formPage",formPage);
        map.put("currentPage",page);
        map.put("size",size);

        return new ModelAndView("/admin/list",map);
    }

    /**
     * 删除接口
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Integer id, Map<String,Object> map){
        System.out.println(id);
        Form form = formService.delete(id);
        if (form == null){
            map.put("msg", "用户不存在");
            map.put("url","/admin/form/list");
            return new ModelAndView("/result/error");
        }
        map.put("url","/admin/form/list");
        map.put("msg", "删除用户成功");
        return new ModelAndView("/result/success", map);
    }

    /**
     * 更新接口
     */
    @PostMapping("/update")
    public ModelAndView update(@Valid UpdateForm updateForm, BindingResult bindingResult, Map<String,Object> map){
        if(bindingResult.hasErrors()){
            map.put("msg",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/admin/form/list");
            return new ModelAndView("/result/error");
        }
        Form form = formService.update(updateForm);
        if (form == null){
            map.put("msg", "用户不存在");
            map.put("url","/admin/form/list");
            return new ModelAndView("/result/error");
        }

        map.put("url","/admin/form/list");
        return new ModelAndView("/result/success", map);
    }



}
