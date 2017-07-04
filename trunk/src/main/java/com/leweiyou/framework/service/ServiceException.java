package com.leweiyou.framework.service;

/**
 * 业务层异常类
 * @author Zhangweican
 *
 */
public class ServiceException extends RuntimeException{
	private int code;
	private String msg;
	
	public ServiceException(){
		
	}
	public ServiceException(Throwable e){
		super(e);
		this.code = -1;
		this.msg = e.getMessage();
	}
	public ServiceException(int code){
		this.code = code;
		this.msg = "";
	}
	public ServiceException(int code,String msg){
		super(msg);
		this.code = code;
		this.msg = msg;
	}
	public ServiceException(String msg){
		super(msg);
		this.code = -1;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
