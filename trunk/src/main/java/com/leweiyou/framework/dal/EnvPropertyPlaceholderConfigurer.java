package com.leweiyou.framework.dal;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.leweiyou.tools.cfg.EnvUtil;



public class EnvPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	static Logger logger = Logger.getLogger(EnvPropertyPlaceholderConfigurer.class);
    public void init() {
        
    	//加载log4j配置
    	String log4jPath = Log4jConfigurer.init();
        String path = EnvUtil.getEnvFilePath();
        Properties p = new Properties();
        try {
			p.load(new FileInputStream(new File(path)));
		} catch (Exception e) {
			logger.error("Load env config error.", e);
		}
        //关键方法,调用的PropertyPlaceholderConfigurer中的方法,通过这个方法将自定义加载的properties文件加入spring中
    	this.setProperties(p); 
    	logger.info("加载Env环境变量位置：" + path);
    	logger.info("加载log4j日志文件位置：" + (StringUtils.isEmpty(log4jPath) ? "没有找到配置文件" : log4jPath));
    }

}

