package com.molia.xm.backend.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author molia
 * @version 1.0
 * date: 2023/12/16
 * description: 登录控制器，负责登录以及登出功能
 */

@RestController
@RequestMapping(value = "xm/user")
public class LoginController {

    @GetMapping("test")
    public String test(){
        return "测试成功test";
    }
}
