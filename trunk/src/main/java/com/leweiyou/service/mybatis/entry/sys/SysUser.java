package com.leweiyou.service.mybatis.entry.sys;

public class SysUser {
    /**<br/>
     * 字段: sys_user.user_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 主键
     */
    private String userId;

    /**<br/>
     * 字段: sys_user.name<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 用户名称
     */
    private String name;

    /**<br/>
     * 字段: sys_user.account<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * 说明: 登录账号
     */
    private String account;

    /**<br/>
     * 字段: sys_user.password<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 100<br/>
     * 说明: 登录密码
     */
    private String password;

    /**<br/>
     * 字段: sys_user.is_valid<br/>
     * 可空: false<br/>
     * 缺省: 1<br/>
     * 长度: 10<br/>
     * 说明: 是否有效（1有效，0无效）
     */
    private Integer isValid;

    /**
     * @return sys_user.user_id: 主键
     */
    public String getUserId() {
        return userId;
    }

    /**<br/>
     * 字段: sys_user.user_id<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param userId: 主键
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return sys_user.name: 用户名称
     */
    public String getName() {
        return name;
    }

    /**<br/>
     * 字段: sys_user.name<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param name: 用户名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return sys_user.account: 登录账号
     */
    public String getAccount() {
        return account;
    }

    /**<br/>
     * 字段: sys_user.account<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 50<br/>
     * @param account: 登录账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * @return sys_user.password: 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**<br/>
     * 字段: sys_user.password<br/>
     * 可空: false<br/>
     * 缺省: <br/>
     * 长度: 100<br/>
     * @param password: 登录密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return sys_user.is_valid: 是否有效（1有效，0无效）
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**<br/>
     * 字段: sys_user.is_valid<br/>
     * 可空: false<br/>
     * 缺省: 1<br/>
     * 长度: 10<br/>
     * @param isValid: 是否有效（1有效，0无效）
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}