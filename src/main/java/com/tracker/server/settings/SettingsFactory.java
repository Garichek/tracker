package com.tracker.server.settings;

import com.tracker.utils.JsonUtils;
import com.tracker.utils.Logger;
import com.tracker.utils.LoggerUtil;

public class SettingsFactory {

	private static Logger LOGGER = LoggerUtil.getLogger(SettingsFactory.class);

	private static ServerSettings settings;

	public static final String CONFIG_PATH = "config/server.json";
	public static final String TEST_CONFIG_PATH = "config/testserver.json";

	public static ServerSettings getInstance() {
		if (settings == null) {
			settings = (ServerSettings) JsonUtils.getJsonObjectFromFile(ServerSettings.class, CONFIG_PATH);
			checkSettings(settings);
		}
		return settings;
	}

	public static ServerSettings getTestInstance() {
		if (settings == null) {
			settings = (ServerSettings) JsonUtils.getJsonObjectFromFile(ServerSettings.class, TEST_CONFIG_PATH);
			checkSettings(settings);
		}
		return settings;
	}

	public static void updateFileSettings(ServerSettings newSettings) {
		settings = newSettings;
		String json = JsonUtils.getJson(settings);
		JsonUtils.writeJsonToFile(json, CONFIG_PATH);
	}

	private static void checkSettings(ServerSettings settings) {
		if (settings != null) {
		}
	}
}
