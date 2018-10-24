package com.leweiyou.framework.dal;

import java.io.File;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.leweiyou.tools.cfg.EnvUtil;

/**
 * 配置log4j的读取位置等信息
 * 1.先读取appcfg下的log4j配置文件
 * 2.读取env.properties配置里的log4j.file配置
 * 3.读取classpath下的配置
 * @author Zhangweican
 *
 */
public class Log4jConfigurer {
	static Logger logger = Logger.getLogger(Log4jConfigurer.class);
	private static final long refreshIntervalDefault = 60 * 60 * 1000;
	/**
	 * 定义log4j文件扫描的时间间隔
	 */
	private static final String refreshIntervalkey = "log4j.file.refresh.interval";
	/**
	 * 定义log4j文件路径
	 */
	private static final String log4jFileKey = "log4j.file";
	
	public static String init(){
		long refreshInterval = refreshIntervalDefault;
		if(StringUtils.isNotEmpty(EnvUtil.getValue(refreshIntervalkey))){
			refreshInterval = Long.valueOf(EnvUtil.getValue(refreshIntervalkey));
		}
		
		//1.判定appcfg路径下是否存在log4j配置文件
		String path = new File(EnvUtil.getEnvFilePath()).getParentFile().getPath();
		String log4jPath = getLog4jConf(path);
		
		//2.读取env.properties配置里的log4j.file配置
		if(StringUtils.isEmpty(log4jPath)){
			log4jPath = EnvUtil.getValue(log4jFileKey);
		}
		
		//3.读取classpath下的配置
		if(StringUtils.isEmpty(log4jPath)){
			path = EnvUtil.class.getResource("/").getPath() + "../classes" + File.separator ;			
			log4jPath = getLog4jConf(path);
		}
		
		//初始化log4j配置文件
		if(StringUtils.isNotEmpty(log4jPath)){
			try {
				logger.info("load log4j from ：" + log4jPath);
				org.springframework.util.Log4jConfigurer.initLogging(log4jPath, refreshInterval);
			} catch (Exception e) {
				logger.error("load log4j error ：" + log4jPath,e);
			}
		}else{
			logger.error("not found log4j config file");
		}
		
		return log4jPath;
		
	}
	
	//查找log4j配置文件
	private static String getLog4jConf(String path){
		String log4jPath = null;
		File f = new File(path,"log4j.properties");
		if(!f.exists()){
			f = new File(path,"log4j.xml");
		}
		if(f.exists()){
			log4jPath = f.getAbsolutePath();
		}
		return log4jPath;
	}

}
