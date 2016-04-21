package com.leweiyou.service.mybatis.entry.sys;

public class SysRole {
    /**<br/>
     * 字段: sys_role.role_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 
     */
    private String roleId;

    /**<br/>
     * 字段: sys_role.name<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 
     */
    private String name;

    /**<br/>
     * 字段: sys_role.parent_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 
     */
    private String parentId;

    /**<br/>
     * 字段: sys_role.is_valid<br/>
     * 可空: false<br/>
     * 缺省: 1<br/>
     * 长度: 10<br/>
     * 说明: 是否有效（1有效，0无效）
     */
    private Integer isValid;

    /**
     * @return sys_role.role_id: 
     */
    public String getRoleId() {
        return roleId;
    }

    /**<br/>
     * 字段: sys_role.role_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param roleId: 
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * @return sys_role.name: 
     */
    public String getName() {
        return name;
    }

    /**<br/>
     * 字段: sys_role.name<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param name: 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return sys_role.parent_id: 
     */
    public String getParentId() {
        return parentId;
    }

    /**<br/>
     * 字段: sys_role.parent_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param parentId: 
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * @return sys_role.is_valid: 是否有效（1有效，0无效）
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**<br/>
     * 字段: sys_role.is_valid<br/>
     * 可空: false<br/>
     * 缺省: 1<br/>
     * 长度: 10<br/>
     * @param isValid: 是否有效（1有效，0无效）
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}