package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsAdmin;
import com.macro.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

/**
 * @class: UmsAdminService
 * @description: 后台管理员
 * @author: cyy
 * @create: 2022-08-08 21:38
 **/
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括权限和+-权限）
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(long adminId);

}
