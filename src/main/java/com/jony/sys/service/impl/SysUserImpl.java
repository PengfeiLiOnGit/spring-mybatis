package com.jony.sys.service.impl;

import com.jony.sys.entity.SysUser;
import com.jony.sys.mapper.SysUserMapper;
import com.jony.sys.service.ISysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserImpl implements ISysUser {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }
}
