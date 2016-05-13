package com.leweiyou.service.mybatis.entry.sys;

public class SysRoleMenu {
    /**<br/>
     * 字段: sys_role_menu.id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 主键
     */
    private String id;

    /**<br/>
     * 字段: sys_role_menu.role_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 角色主键ID
     */
    private String roleId;

    /**<br/>
     * 字段: sys_role_menu.menu_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 菜单主键ID
     */
    private String menuId;

    /**
     * @return sys_role_menu.id: 主键
     */
    public String getId() {
        return id;
    }

    /**<br/>
     * 字段: sys_role_menu.id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param id: 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return sys_role_menu.role_id: 角色主键ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**<br/>
     * 字段: sys_role_menu.role_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param roleId: 角色主键ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * @return sys_role_menu.menu_id: 菜单主键ID
     */
    public String getMenuId() {
        return menuId;
    }

    /**<br/>
     * 字段: sys_role_menu.menu_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param menuId: 菜单主键ID
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }
}