package com.karthik.core.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class DequeConcept {

	public static void main(String[] args) {

		// Deque --> ArrayDeque, LinkedList, LinkeBlockingDeque
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(34);
		dq.addFirst(22);
		dq.addLast(45);
		dq.addFirst(22);
		dq.addLast(45);
		dq.addFirst(22);
		dq.addLast(45);
		dq.addFirst(22);
		dq.addLast(45);
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		dq.remove(22);

		System.out.println(dq);

		// LinkedList implementing deque
		Deque<Integer> dql = new LinkedList<Integer>();
		dql.add(34);
		dql.addFirst(22);
		dql.addLast(45);
		dql.offer(3);
		dql.offerFirst(33);
		dql.offerLast(56);

		System.out.println(dql);
		dql.pollFirst();
		dql.pollLast();
		dql.poll();
		System.out.println(dql);

		// LinkedBlockingQueue
		Deque<Integer> lbq = new LinkedBlockingDeque<Integer>(); // thread safe
		lbq.add(34);
		lbq.addFirst(22);
		lbq.addLast(45);
		lbq.offer(3);
		lbq.offerFirst(33);
		lbq.offerLast(56);

		System.out.println(lbq);

	}

}
