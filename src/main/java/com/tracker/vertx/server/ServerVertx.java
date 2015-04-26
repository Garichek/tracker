package com.tracker.vertx.server;

import java.util.Arrays;

import org.vertx.java.core.Handler;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.VertxFactory;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.net.NetServer;
import org.vertx.java.core.net.NetSocket;

import com.tracker.utils.Logger;
import com.tracker.utils.LoggerUtil;

public class ServerVertx {

	private Logger LOGGER = LoggerUtil.getLogger(ServerVertx.class);

	private String ipAdress = "127.0.0.1";
	private int port = 8080;
	private Vertx vertX;
	private NetServer server;
	private NetSocket serverSocket;

	public ServerVertx() {

		
		vertX = VertxFactory.newVertx();
		server = vertX.createNetServer();
		server.setTCPKeepAlive(true);
		server.setTCPNoDelay(true);

		server.connectHandler(new Handler<NetSocket>() {
			public void handle(NetSocket sock) {
				sock.dataHandler(new Handler<Buffer>() {
					public void handle(Buffer buffer) {
						LOGGER.info("I received packet size = %s  bytes", buffer.length());
						LOGGER.info("Packet data in bytes = %s ",Arrays.toString(buffer.getBytes()));
						LOGGER.info("Packet data in string = %s ",buffer.toString());
					}
				});
			}
		}).listen(port, ipAdress);

	}

}
