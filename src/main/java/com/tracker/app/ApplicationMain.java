package com.tracker.app;

import com.tracker.utils.Logger;
import com.tracker.utils.LoggerUtil;
import com.tracker.vertx.server.ServerVertx;

public class ApplicationMain {

	private static Logger LOGGER = LoggerUtil.getLogger(ApplicationMain.class);

	public static void main(String[] args) {

		LOGGER.info("START  APPLICATION");

		ServerVertx server = new ServerVertx();

		LOGGER.info("START  SERVER VERTX");

		while (true) {

		}

	}

}
