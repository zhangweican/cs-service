package com.leweiyou.service.mybatis.entry.sys;

public class SysUserRole {
    /**<br/>
     * 字段: sys_user_role.id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 主键
     */
    private String id;

    /**<br/>
     * 字段: sys_user_role.user_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 用户主键ID
     */
    private String userId;

    /**<br/>
     * 字段: sys_user_role.role_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 角色主键ID
     */
    private String roleId;

    /**
     * @return sys_user_role.id: 主键
     */
    public String getId() {
        return id;
    }

    /**<br/>
     * 字段: sys_user_role.id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param id: 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return sys_user_role.user_id: 用户主键ID
     */
    public String getUserId() {
        return userId;
    }

    /**<br/>
     * 字段: sys_user_role.user_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param userId: 用户主键ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return sys_user_role.role_id: 角色主键ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**<br/>
     * 字段: sys_user_role.role_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param roleId: 角色主键ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}