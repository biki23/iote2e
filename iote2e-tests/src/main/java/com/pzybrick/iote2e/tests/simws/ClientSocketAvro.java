package com.pzybrick.iote2e.tests.simws;

import java.util.concurrent.ConcurrentLinkedQueue;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ClientEndpoint
@ServerEndpoint(value = "/iote2e/")
public class ClientSocketAvro {
	private static final Logger logger = LogManager.getLogger(ClientSocketAvro.class);
	private Thread iote2eRequestReceiveThread;
	private ConcurrentLinkedQueue<byte[]> iote2eResultBytes;
	
	public ClientSocketAvro( ) {
		logger.debug("IotClientSocketAvro ctor empty");
	}
	
	public ClientSocketAvro( Thread iote2eRequestReceiveThread, ConcurrentLinkedQueue<byte[]> iote2eResultBytes ) {
		logger.debug("IotClientSocketAvro ctor thread, queue");
		this.iote2eRequestReceiveThread = iote2eRequestReceiveThread;
		this.iote2eResultBytes = iote2eResultBytes;
	}

	@OnOpen
	public void onWebSocketConnect(Session session) {
		session.setMaxBinaryMessageBufferSize(1024 * 256); // 256K
		logger.debug("Socket Connected: " + session.getId());
	}

	@OnMessage
	public void onWebSocketText(String message) {
		//iote2eResultBytes.add(message);
		//iotClientSocketThread.interrupt();
	}

	@OnMessage
	public void onWebSocketText(byte[] messageByte) {
		logger.debug("rcvd byte message");
		iote2eResultBytes.add( messageByte );
		iote2eRequestReceiveThread.interrupt();
	}

	@OnClose
	public void onWebSocketClose(CloseReason reason) {
		logger.info("Socket Closed: " + reason);
	}

	@OnError
	public void onWebSocketError(Throwable cause) {
		logger.error(cause);
	}

	public ConcurrentLinkedQueue<byte[]> getRcvdAvroByteArrays() {
		return iote2eResultBytes;
	}

	public void setIote2eResultBytes(ConcurrentLinkedQueue<byte[]> iote2eResultBytes) {
		this.iote2eResultBytes = iote2eResultBytes;
	}
}