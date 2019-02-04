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
    public void run() {
        try{
        for (int i = 0; i < 10; i += 1) {
            System.out.println(i);
                Thread.sleep(300);

        }
        } catch (InterruptedException e) {
        }
    }
}