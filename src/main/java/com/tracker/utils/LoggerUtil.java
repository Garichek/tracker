package com.tracker.utils;

import java.util.HashMap;
import java.util.Map;


public class LoggerUtil {

	protected static Map<Class, Logger> loggerInstances = new HashMap<Class, Logger>();

	public static Logger getLogger(Class clazz) {
		Logger logger = LoggerUtil.loggerInstances.get(clazz);
		if (null == logger) {
			logger = new Logger(org.slf4j.LoggerFactory.getLogger(clazz));
			loggerInstances.put(clazz, logger);
		}
		return logger;
	}
	
	


}
