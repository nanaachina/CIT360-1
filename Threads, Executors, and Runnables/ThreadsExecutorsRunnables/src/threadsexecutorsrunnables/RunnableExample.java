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

          public static String runnableMaybe;
    public void test(){
        for(int grade=1;grade<=10;grade++){
            System.out.println(Thread.currentThread().getName()+" got number "+ grade +" right ");
            boolean ifPassed = this.ifPassed(grade);
            if(ifPassed){
                break;
            }
        }
    }
    private boolean ifPassed(int pass){
        boolean ifPassed = false;
        if((RunnableExample.runnableMaybe==null)&&(pass==10)){
            String passName=Thread.currentThread().getName();
            RunnableExample.runnableMaybe=passName;
            System.out.println("You passed!");
            ifPassed=true;
        }
        else if(RunnableExample.runnableMaybe==null){
            ifPassed=false;
        }
        else if(RunnableExample.runnableMaybe==null){
            ifPassed=true;
        }
        return ifPassed;
    }
    public void run(){
        this.test();
    }
}