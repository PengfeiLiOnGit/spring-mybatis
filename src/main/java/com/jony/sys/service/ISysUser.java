package com.jony.sys.service;

import com.jony.sys.entity.SysUser;

import java.util.List;

public interface ISysUser {
    List<SysUser> selectAll();
}
