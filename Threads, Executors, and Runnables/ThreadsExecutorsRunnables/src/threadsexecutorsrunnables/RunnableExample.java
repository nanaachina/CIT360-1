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
public class RunnableExample implements Runnable {

        @Override
	public void run(){
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread id: "
                +Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}