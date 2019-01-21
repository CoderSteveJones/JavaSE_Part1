package com.ym01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class NetDemo2 {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(8888);
		byte[] bt = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bt, bt.length);
		ds.receive(dp);
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		
		//输出数据
		System.out.println("sender ---> " + address.getHostAddress());
		//System.out.println(new String(data,0,length));
		System.out.println(new String(data,0,data.length));
		//释放资源
		ds.close();


	}
}
