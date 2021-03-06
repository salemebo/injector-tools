package org.injector.tools.ssh.proxyhandler;

import java.io.IOException;
import java.net.Socket;

import org.injector.tools.speed.NetworkMonitorSpeed;


public class DirectProxy extends ProxySocket{

	public DirectProxy(String proxyHost, int proxyPort) {
		super(proxyHost, proxyPort);
	}
	public DirectProxy(String proxyHost, int proxyPort, NetworkMonitorSpeed monitorSpeed) {
		super(proxyHost, proxyPort, monitorSpeed);
	}

	@Override
	public Socket openSoccketConnection(String hostname, int port, int timeout) throws IOException {
		return new Socket(hostname, port);
	}

}
