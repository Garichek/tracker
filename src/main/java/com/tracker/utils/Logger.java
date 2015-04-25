package com.tracker.utils;

public class Logger {

	private org.slf4j.Logger logger;

	public Logger(org.slf4j.Logger logger) {
		this.logger = logger;
	}

	public void info(String format, Object... args) {
		if (logger.isInfoEnabled()) {
			logger.info(String.format(format, args));
		}
	}

	public void trace(String format, Object... args) {
		if (logger.isTraceEnabled()) {
			logger.trace(String.format(format, args));
		}
	}

	public void debug(String format, Object... args) {
		if (logger.isDebugEnabled()) {
			logger.debug(String.format(format, args));
		}
	}

	public void warn(String format, Object... args) {
		logger.warn(String.format(format, args));
	}

	public void error(String format, Object... args) {
		logger.error(String.format(format, args));
	}

}
