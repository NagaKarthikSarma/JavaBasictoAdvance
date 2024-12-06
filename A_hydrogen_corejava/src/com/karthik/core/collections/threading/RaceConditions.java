package com.karthik.core.collections.threading;

public class RaceConditions implements Runnable {

	public static void main(String[] args) {
		
		//synchronized method
		//synchronized block
		
   Thread t1 = new Thread(new RaceConditions());
   
   Thread t2 = new Thread(new RaceConditions());
   t1.start();
   t2.start();
	}

	@Override
	public void run() {
		RaceConditions h= new RaceConditions();
//		h.hello();
		synchronized(this) {
		hello();
		}
	}
	
	public static synchronized void hello() {
		
		
		int a = 0;
		for(a=0;a<100;a++) {
			a=a++;
			
		}
		System.out.println(a);
		
	
	}

}
