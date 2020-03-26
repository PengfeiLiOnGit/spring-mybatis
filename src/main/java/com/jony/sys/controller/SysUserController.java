package com.jony.sys.controller;

import com.jony.sys.entity.SysUser;
import com.jony.sys.service.ISysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SysUserController {
    @Autowired
    private ISysUser sysUser;

    @RequestMapping("/user")
    public String list(){
        List<SysUser> users = sysUser.selectAll();
        return "";
    }
}
