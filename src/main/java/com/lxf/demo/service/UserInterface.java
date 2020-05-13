package com.lxf.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lixf
 * @date 2020/5/12 17:06
 */
@FeignClient(name = "user", url = "http://localhost:8002/user")
@RequestMapping("/user/interface")
public interface UserInterface {
    @RequestMapping(value = "/userStr/{code}", method = RequestMethod.GET)
    String userStr(@PathVariable("code") String code, @RequestParam(name = "suffix") String suffix);
}
