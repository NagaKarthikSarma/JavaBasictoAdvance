package com.karthik.core.collections.threading;

public class MultithreradConc extends Thread{

	public static void main(String[] args) {
		
		
		MultithreradConc  t1 = new MultithreradConc();
		
       t1.start();

		MultithreradConc  t2 = new MultithreradConc();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
      t2.start();
	}

	public void run() {
		
		int a=0;
		for (a=0; a<10;a++) {
			
			System.out.println("the value of a: "+a+ Thread.currentThread().getName());
			
		}
	}
	
}
