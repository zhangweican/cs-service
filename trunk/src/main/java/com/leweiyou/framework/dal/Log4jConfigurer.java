package com.leweiyou.framework.dal;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.leweiyou.tools.cfg.CfgPath;
import com.leweiyou.tools.cfg.EnvUtil;

/**
 * 配置log4j的读取位置等信息
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
	public static void init(){
		long refreshInterval = refreshIntervalDefault;
		if(StringUtils.isNotEmpty(EnvUtil.getValue(refreshIntervalkey))){
			refreshInterval = Long.valueOf(EnvUtil.getValue(refreshIntervalkey));
		}
		
		//判定appcfg路径下是否存在log4j配置文件
		String path = new File(EnvUtil.getEnvFilePath()).getParentFile().getPath();
		String log4jPath = getLog4jConf(path);
		
		if(log4jPath != null){
			try {
				logger.info("load log4j from ：" + log4jPath);
				org.springframework.util.Log4jConfigurer.initLogging(log4jPath, refreshInterval);
			} catch (Exception e) {
				logger.error("load log4j error ：" + log4jPath,e);
			}
		}else{
			path = EnvUtil.class.getResource("/").getPath() + "../classes" + File.separator ;			
			log4jPath = getLog4jConf(path);
			if(log4jPath != null){
				try {
					logger.info("load log4j from ：" + log4jPath);
					org.springframework.util.Log4jConfigurer.initLogging(log4jPath, refreshInterval);
				} catch (Exception e) {
					logger.error("load log4j error ：" + log4jPath,e);
				}
			}else{
				logger.error("not found log4j config file");
			}
		}
		
		
	}
	private static String getLog4jConf(String path){
		String log4jPath = null;
		File f = new File(path,"log4j.properties");
		if(!f.exists()){
			f = new File(path,"log4j.xml");
		}
		//如果appcfg下面不存在log4j配置文件，则读取env.properties文件中配置吗，
		if(!f.exists()){
			if(StringUtils.isNotEmpty(EnvUtil.getValue(log4jFileKey))){
				log4jPath = EnvUtil.getValue(log4jFileKey);
			}
		}else{
			log4jPath = f.getAbsolutePath();
		}
		return log4jPath;
	}
}
