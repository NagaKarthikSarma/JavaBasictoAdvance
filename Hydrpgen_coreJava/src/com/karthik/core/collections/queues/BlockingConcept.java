package com.karthik.core.collections.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingConcept {

	public static void main(String[] args) {
		PriorityBlockingQueue<Integer> abq = new PriorityBlockingQueue<Integer>(3);

		Thread produce = new Thread(() -> {

			try {
				for (int i = 0; i < 5; i++) {
					int ele = i;
					abq.put(i);
					System.out.println("enetered element: " + ele);
				//	Thread.sleep(1000);
				}
			} catch (Exception e) {

			}

		});

		Thread consume = new Thread(() -> {

			try {

				for(int i=0;i<2;i++) {
				int ele = abq.take();
		
				System.out.println("removed element :" + ele);

				}
				//Thread.sleep(1000);

			} catch (Exception e) {

			}

		});

		produce.start();
		consume.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(abq);
	}

}
