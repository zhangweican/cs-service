package com.leweiyou.framework.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.alibaba.dubbo.config.ProtocolConfig;

public class DubboShutDownHook implements ServletContextListener{
	private static Logger logger = Logger.getLogger(DubboShutDownHook.class);
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("DubboShutDownHook: contextInitialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ProtocolConfig.destroyAll();		
		logger.info("DubboShutDownHook: contextDestroyed");
	}

}
