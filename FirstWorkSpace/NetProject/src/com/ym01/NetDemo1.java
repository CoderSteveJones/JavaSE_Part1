package com.ym01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class NetDemo1 {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket socket = new DatagramSocket();
		byte[] bt = "hello xiao ming".getBytes();
		int length = bt.length;
		InetAddress  address =InetAddress.getLocalHost();
		DatagramPacket pg = new DatagramPacket(bt, length, address, 8888);
		socket.send(pg);
		socket.close();
	}

	
}
