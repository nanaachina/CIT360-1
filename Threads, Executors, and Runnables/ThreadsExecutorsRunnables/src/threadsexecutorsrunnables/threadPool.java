/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexecutorsrunnables;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author seth
 */

public class threadPool {
    
	public static void main(String[] args) {
		Executor anExecutor = Executors.newCachedThreadPool();
		for(int threadCnt = 0; threadCnt < 3; threadCnt++){
			RunnableExample SimpleRunnable = 
            new RunnableExample();
			anExecutor.execute(SimpleRunnable);
		}
		try {
			Thread.sleep(3000);
			System.out.println("Wake Up!");
			for(int threadCnt = 0; threadCnt < 3; threadCnt++){
				RunnableExample simpleRunnable = 
                new RunnableExample();
				anExecutor.execute(simpleRunnable);
			}
		} catch (InterruptedException e) {
                    // TODO Auto-generated catch block

		}
        
	}
}