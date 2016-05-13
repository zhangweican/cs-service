package com.leweiyou.service.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.leweiyou.service.mybatis.entry.sys.SysMenu;
import com.leweiyou.service.util.Commons;

/**
 * 针对用户缓存的信息
 * @author Zhangweican
 *
 */
public class SessionUser implements Serializable{
	
	private static final long serialVersionUID = 8541307043821592596L;
	private String userId = null;
	private String account = null;
	private Set<String> roleIds = new HashSet<String>();
	private Set<String> rights = new HashSet<String>();
	private String tree = null;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Set<String> getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(Set<String> roleIds) {
		this.roleIds = roleIds;
	}
	public Set<String> getRights() {
		return rights;
	}
	public void setRights(Set<String> rights) {
		this.rights = rights;
	}
	public String getTree() {
		return tree;
	}
	public void setTree(Set<SysMenu> menus) {
		for(SysMenu sm : menus){
			if(Commons.MenuType_tree == sm.getType()){
				this.tree += sm.getName() + "  " + sm.getPageUrl() + " " + sm.getParentId();
			}
		}
	}
	public void setRightsBySysMenu(Set<SysMenu> rights) {
		for(SysMenu sm : rights){
			if(Commons.MenuType_button == sm.getType()){
				this.rights.add(sm.getPageUrl());
			}
		}
	}
	
	public void addRoleId(String roleId) {
		this.roleIds.add(roleId);
	}
	public void addRight(SysMenu menu) {
		if(Commons.MenuType_button == menu.getType()){
			this.rights.add(menu.getPageUrl());
		}
	}
	
	
}
