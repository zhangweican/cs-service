package com.leweiyou.service.mybatis.entry.sys;

public class SysMenu {
    /**<br/>
     * 字段: sys_menu.menu_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 菜单主键
     */
    private String menuId;

    /**<br/>
     * 字段: sys_menu.name<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 菜单名称
     */
    private String name;

    /**<br/>
     * 字段: sys_menu.parent_id<br/>
     * 可空: true<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 父菜单ID
     */
    private String parentId;

    /**<br/>
     * 字段: sys_menu.page_url<br/>
     * 可空: true<br/>
     * 缺省: <br/>
     * 长度: 100<br/>
     * 说明: 页面URL
     */
    private String pageUrl;

    /**<br/>
     * 字段: sys_menu.type<br/>
     * 可空: false<br/>
     * 缺省: 0<br/>
     * 长度: 10<br/>
     * 说明: 菜单类型(0系统菜单1普通菜单)
     */
    private Integer type;

    /**<br/>
     * 字段: sys_menu.is_valid<br/>
     * 可空: false<br/>
     * 缺省: 1<br/>
     * 长度: 10<br/>
     * 说明: 是否有效（1有效，0无效）
     */
    private Integer isValid;

    /**
     * @return sys_menu.menu_id: 菜单主键
     */
    public String getMenuId() {
        return menuId;
    }

    /**<br/>
     * 字段: sys_menu.menu_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param menuId: 菜单主键
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * @return sys_menu.name: 菜单名称
     */
    public String getName() {
        return name;
    }

    /**<br/>
     * 字段: sys_menu.name<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param name: 菜单名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return sys_menu.parent_id: 父菜单ID
     */
    public String getParentId() {
        return parentId;
    }

    /**<br/>
     * 字段: sys_menu.parent_id<br/>
     * 可空: true<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param parentId: 父菜单ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * @return sys_menu.page_url: 页面URL
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**<br/>
     * 字段: sys_menu.page_url<br/>
     * 可空: true<br/>
     * 缺省: <br/>
     * 长度: 100<br/>
     * @param pageUrl: 页面URL
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }

    /**
     * @return sys_menu.type: 菜单类型(0系统菜单1普通菜单)
     */
    public Integer getType() {
        return type;
    }

    /**<br/>
     * 字段: sys_menu.type<br/>
     * 可空: false<br/>
     * 缺省: 0<br/>
     * 长度: 10<br/>
     * @param type: 菜单类型(0系统菜单1普通菜单)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return sys_menu.is_valid: 是否有效（1有效，0无效）
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**<br/>
     * 字段: sys_menu.is_valid<br/>
     * 可空: false<br/>
     * 缺省: 1<br/>
     * 长度: 10<br/>
     * @param isValid: 是否有效（1有效，0无效）
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}