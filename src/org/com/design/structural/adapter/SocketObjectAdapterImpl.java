package org.com.design.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt() {
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = sock.getVolt();
		return ConvertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = sock.getVolt();
		return ConvertVolt(v, 40);
	}

	private Volt ConvertVolt(Volt v, int i) {
		return new Volt(v.getVolt() / i);
	}

}
