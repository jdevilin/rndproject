package org.com.design.structural.adapter;

/**
 * @author Saurabh it’s used so that two unrelated interfaces can work together.
 *         The object that joins these unrelated interfaces is called an
 *         Adapter.
 *
 */
public class AdapterDesignPattern {
	
	public static void main(String[] args) {
		testObjectAdapter();
		testClassAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);
		System.out.println("V3 volts using Object Adapter =" + v3.getVolt());
		System.out.println("v12 volts using Object Adapter =" + v12.getVolt());
		System.out.println("v120 vlots using Object Adapter =" + v12.getVolt());
	}
	
	private static void testClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);
		System.out.println("V3 volts using Object Adapter =" + v3.getVolt());
		System.out.println("v12 volts using Object Adapter =" + v12.getVolt());
		System.out.println("v120 vlots using Object Adapter =" + v12.getVolt());
	}

	private static Volt getVolt(SocketAdapter socketAdapter, int i) {
		switch (i) {
		case 3:
			return socketAdapter.get3Volt();
		case 12:
			return socketAdapter.get12Volt();
		case 120:
			return socketAdapter.get120Volt();
		default:
			return socketAdapter.get120Volt();
		}
	}

}
