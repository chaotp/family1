package com.ctp.family.controller;

import com.ctp.family.domain.Auser;
import com.ctp.family.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:16338
 * package:com.ctp.family.controller
 * Description:TODO
 *
 * @date:2020/1/16 - 11:23
 * @Author:chaotianpeng
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/q/qryUserById")
    public Auser qryUserById(@RequestParam String id){
        Auser auser = userService.qryUserById(id);
        return auser;
    }
    @PostMapping("/a/addAuser")
    public String addAuser(@RequestBody Auser auser){
        String s = userService.addAuser(auser);
        return s;
    }
    @PostMapping("/u/upAuser")
    public String upAuser(@RequestBody Auser auser){
        String s = userService.upAuser(auser);
        return s;
    }
    @GetMapping("/d/delAuser")
    public String delAuser(@RequestParam String id){
        String s = userService.delAuser(id);
        return s;
    }
}
