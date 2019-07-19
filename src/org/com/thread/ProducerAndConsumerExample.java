package org.com.thread;

public class ProducerAndConsumerExample {

	public static void main(String[] args) throws InterruptedException {

		final ProducerAndConsumer pc = new ProducerAndConsumer();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					pc.produce();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
