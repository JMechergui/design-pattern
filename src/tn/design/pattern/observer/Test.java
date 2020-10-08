package tn.design.pattern.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {

		final Subscriber sub1 = new FaceBookSub(1, "jihed");
		Subscriber sub2 = new InstaSub(2, "haifa");

		final Publisher publisher = new Publisher();

		publisher.addSubscriber(sub1);
		publisher.addSubscriber(sub2);

		Runnable t = new Runnable() {
			@Override
			public void run() {
				int i = 0;

				while (i < 10) {

					try {

						System.out.println("Messages :\n\n");

						for (String message : sub1.getMessages()) {

							System.out.println("\t-" + message);
						}

						Thread.currentThread().sleep(10000L);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
				}

			}
		};
		
		Runnable t1 = new Runnable() {
			@Override
			public void run() {

				while (true) {

					try {
						BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
						String message;
						try {
							message = reader.readLine();
							System.out.println();
							publisher.notify(message);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 
						Thread.currentThread().sleep(500L);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};

		Thread th = new Thread(t);
		th.start();

		Thread th1 = new Thread(t1);
		th.start();
		

	}

}
