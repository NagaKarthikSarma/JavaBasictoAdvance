package com.karthik.core.collections.queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queuesim {

	public static void main(String[] args) {

		// Queue --> first in first out queue--> blocking queue , linkedlist, priority
		// queue

		// Blocking queue --> ArrayBlockingQueue, LinkedBlockingQueue,
		// priorityBlockingQueue
		// ArrayBlocing, LinkedBlockingQueue and priorityBlockingQueue are thread safe
		Queue<Integer> qu = new ArrayBlockingQueue<Integer>(5); // the capacity need to be specified in the queue

		qu.add(34);
		qu.add(45);
		qu.offer(23);
   
		System.out.println(qu);
		qu.add(45);

		System.out.println(qu);
		System.out.println(qu.peek());
		qu.poll();
		System.out.println(qu);

		Queue<String> lbq = new LinkedBlockingQueue<String>(); // can be bounded or unbounded
																// LinkedBlockingQueue<String>(5);
		Queue<String> pbq = new PriorityBlockingQueue<String>(); // can be bounded or unbounded
																	// PriorityBlockingQueue<String>(5);

		// Queue implementing the linkedlist
		Queue<String> qut = new LinkedList<String>();

		qut.offer("56");
		qut.add("45");
		qut.add("karthik");
		qut.offer("sarma");

		// queue implementing the priorityqueue

	}

}
