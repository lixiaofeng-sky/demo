package com.lxf.demo.controller;

import com.lxf.demo.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lixf
 * @date 2020/5/12 15:52
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserInterface userInterface;

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    @ResponseBody
    public String getWord(@RequestParam(name = "code") String code) {
        System.out.println("code is ");
        System.out.println(code);
        return "李小锋";
    }

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String getFeignRes() {
        System.out.println("into getFeignRes...........");
        String res = userInterface.userStr("007", "特工");
        return res;
    }


}
