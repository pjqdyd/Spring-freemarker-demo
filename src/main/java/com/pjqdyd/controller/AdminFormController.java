package com.pjqdyd.controller;

import com.pjqdyd.entity.Form;
import com.pjqdyd.service.impl.FormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 管理订单Controller
 */
@Controller
@RequestMapping("/admin/form")
public class AdminFormController {
    @Autowired
    private FormServiceImpl formService;

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


}
