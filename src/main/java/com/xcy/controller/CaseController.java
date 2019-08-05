package com.xcy.controller;

import com.xcy.pojo.Cases;
import com.xcy.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CaseController {

    @Autowired
    private CaseService caseService;

    @RequestMapping("showAllList")
    public List<Cases> showAllList() {
        return caseService.selectAllCase();

    }

    @RequestMapping("selectById")
    public String selectById(int id){
        int a = caseService.selectById(id);
        if(a>0){
            return "success";
        }else{
            return "fail";
        }


    }

    @RequestMapping("selectByName")
    public String selectByName(String string){
        int b = caseService.selectByName(string);
        if (b>0){
            return "true";
        }else {
            return "false";
        }
    }

}
