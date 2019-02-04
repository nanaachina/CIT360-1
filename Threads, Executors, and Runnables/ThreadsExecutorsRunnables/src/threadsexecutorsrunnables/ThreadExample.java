/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexecutorsrunnables;

/**
 *
 * @author seth
 */
public class ThreadExample {
	
	public static void main(String[] args){

       		new ThreadTest(1).start();
       		new ThreadTest(5).start();
       		new ThreadTest(9).start();
	}
}	

class ThreadTest extends Thread {
	int startLine;
	
	
	public ThreadTest(int input){
		startLine = input;
	}
	
        @Override
	public void run(){
		System.out.println(Thread.currentThread().getName()
				+ " is counting to 10 starting at "
				+ startLine);
		for (int i = startLine; i < 4; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try{
				ThreadTest.sleep(1500);
				
				ThreadTest.sleep(0, 999999);
			}	
			catch (InterruptedException e) {
			}
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " is finished!");
	}
}