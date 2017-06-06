package com.leweiyou.framework.service;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

/**
 * 扩展对接数据库存储过程的参数接受的hashmap
 * <br><font color=red>处于试验阶段，看看这样使用是否方便</font>
 * @author Zhangweican
 */
public class ParamHashMap<K, V> extends HashMap<K, V> {
	
	public Integer getReturnCode() {
		return get("returnCode") == null ? null : Integer.valueOf(get("returnCode") + "");
	}
	public String getReturnMsg() {
		return get("returnMsg") == null ? null : (get("returnMsg") + "");
	}
	
	/**
	 * 对数据库返回的信息进行校验
	 * @param errorCode
	 * @param errorMsg
	 * @throws ServiceException
	 */
	public void valid(Integer errorCode,String errorMsg) throws ServiceException{
		if(getReturnCode()==null || getReturnCode() != 0){
			throw new ServiceException(errorCode == null ? getReturnCode() : getReturnCode(),StringUtils.isEmpty(errorMsg) ? getReturnMsg() : errorMsg);
		}
	}
	/**
	 * 对数据库返回的信息进行校验
	 * @param errorCode
	 * @throws ServiceException
	 */
	public void valid(Integer errorCode) throws ServiceException{
		valid(errorCode,getReturnMsg());
	}
	/**
	 * 对数据库返回的信息进行校验
	 * @throws ServiceException
	 */
	public void valid() throws ServiceException{
		valid(getReturnCode(),getReturnMsg());
	}
}
