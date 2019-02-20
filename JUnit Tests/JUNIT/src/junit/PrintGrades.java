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
            return "You got an A! Shhh! Be quiet about it, or they might recalculate your score.";
        else if(grade > 83)
            return "Booyah! You got a B!!";
        else if(grade >73)
            return "Cs still pass!!!.";
        else
            return "You'll be retaking this class… again.";
    }
    
}
