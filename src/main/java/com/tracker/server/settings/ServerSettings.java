package com.tracker.server.settings;

import com.google.gson.annotations.Expose;

public class ServerSettings {

	@Expose
	private String host = "localhost";

	@Expose
	private Integer port;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
