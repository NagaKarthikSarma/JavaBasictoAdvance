package com.karthik.core.collections.threading;

public class RunnableThre implements Runnable{

	public static void main(String[] args) {
	
		Thread t1= new Thread(new RunnableThre());
		
		t1.start();
		
		Thread t2= new Thread(new RunnableThre());
	//	t2.setName("Thread -1");
		t2.start();
		
	}

	@Override
	public void run() {
		int i=0;
		for(i=0;i<10;i++) {
			System.out.println("the value of i: "+ i +"--"+Thread.currentThread().getName());
		}
		
	}

}
