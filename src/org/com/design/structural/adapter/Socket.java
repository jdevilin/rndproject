package org.com.design.structural.adapter;

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}

}
