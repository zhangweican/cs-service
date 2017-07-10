package com.leweiyou.framework.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.leweiyou.tools.bean.BeanUtils;

/**
 * 扩展对接数据库存储过程的参数接受的hashmap，结合BaseMapper可以简化存储过程操作
 * <br><font color=red>该方法主要针对的是存储过程调用时候的入参和出参</font><br>
 * 模板的映射文件参考-mapper.xml.templete
 * @author Zhangweican
 */
public class ParamHashMap extends HashMap<String,Object> {
	protected  Logger logger = Logger.getLogger(this.getClass());
	private List<String> struts = new ArrayList<String>();
	//接收一个对象，或者 map ，当in 时候，直接 从这里获取数据，而不用再 重新设置
	private Object origObject = null;
	
	public ParamHashMap(){
		//nothing do
	}
	public ParamHashMap(Object origObject){
		this.origObject = origObject;
	}
	
	/**
	 * 获取存储过程返回的操作码
	 * @return
	 */
	public Integer getReturnCode() {
		return get("returnCode") == null ? -1 : Integer.valueOf(get("returnCode") + "");
	}
	/**
	 * 获取存储过程返回的信息
	 * @return
	 */
	public String getReturnMsg() {
		return get("returnMsg") == null ? null : (get("returnMsg") + "");
	}
	/**
	 * 获取总记录
	 * @return
	 */
	public int getTotalCount() {
		return get("totalCount") == null ? 0 : Integer.valueOf(get("totalCount") + "");
	}
	
	/**
	 * 对数据库返回的信息进行校验
	 * @param errorCode
	 * @param errorMsg
	 * @throws ServiceException
	 */
	public void valid(Integer errorCode,String errorMsg) throws ServiceException{
		if(getReturnCode()==null || getReturnCode() != 0){
			logger.error("db returnCode: "  + getReturnCode() + ",returnMsg: " + getReturnMsg());
			throw new ServiceException(errorCode == null ? getReturnCode() : errorCode,StringUtils.isEmpty(errorMsg) ? getReturnMsg() : errorMsg);
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
	
	//构造存储过程的结构
	public ParamHashMap in(String key){
		struts.add("#{params." + key + ",mode=IN}");
		this.put(key, this.getValueFromOrigObject(key));
		return this;
	}
	//构造存储过程的结构
	public ParamHashMap in(String key,Object value){
		struts.add("#{params." + key + ",mode=IN}");
		this.put(key, value);
		return this;
	}
	//构造存储过程的结构
	public ParamHashMap in(String key,Object value,String jdbcType){
		struts.add("#{params." + key + ",mode=IN,jdbcType=" + jdbcType + "}");
		this.put(key, value);
		return this;
	}
	//构造存储过程的结构
	public ParamHashMap out(String key,String jdbcType){
		struts.add("#{params." + key + ",mode=OUT,jdbcType=" + jdbcType + "}");
		this.put(key, null);
		return this;
	}
	
	/**
	 * 输出结构
	 * @return
	 */
	public List<String> toStruts(){
    	out("returnCode","INTEGER");
    	out("returnMsg","VARCHAR");
		return struts;
	}
	/**
	 * 输出结构
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<String> toStrutsWithPage(int pageNum,int pageSize){
        in("pageNum",pageNum);
        in("pageSize",pageSize);
        out("totalCount","INTEGER");
		out("returnCode","INTEGER");
		out("returnMsg","VARCHAR");
		return struts;
	}
	
	/**
	 * 从传入的构造方法里，检索出值
	 * @return
	 */
	private Object getValueFromOrigObject(String key){
		if(this.origObject instanceof Map){
			return ((Map)this.origObject).get(key);
		}
		try {
			return BeanUtils.getProperty(this.origObject, key);
		} catch (Exception e) {
			//不处理
		}
		
		return null;
	}
	
}
