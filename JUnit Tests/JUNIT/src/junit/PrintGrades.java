/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author seth
 */
public class PrintGrades {
    public String print(int grade)
    {
        if(grade > 93)
            return "You got an A!";
        else if(grade > 83)
            return "You passed with a B!";
        else if(grade >73)
            return "You are average. C grade for you.";
        else
            return "Should have studied your Java better...";
    }
    
}
