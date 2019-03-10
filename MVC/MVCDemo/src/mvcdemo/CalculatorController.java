/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author seth
 */

public class CalculatorController {
    
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        
        this.theView.addCalculateListener(new CalculateListener());
                this.theView.addCalculateListener2(new CalculateListener2());
                this.theView.addCalculateListener3(new CalculateListener3());
                this.theView.addCalculateListener4(new CalculateListener4());
    }
    
    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter two Integers");
            }
        }
    }
        class CalculateListener2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int thirdNumber, fourthNumber = 0;

            try{
                thirdNumber = theView.getThirdNumber();
                fourthNumber = theView.getFourthNumber();
                theModel.subtractTwoNumbers(thirdNumber, fourthNumber);
                theView.setCalcSolution2(theModel.getCalculationValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter two Integers");  
            }
        }
    }
        class CalculateListener3 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int fifthNumber, sixthNumber = 0;
            
            try{
                fifthNumber = theView.getFifthNumber();
                sixthNumber = theView.getSixthNumber();
                theModel.multiplyTwoNumbers(fifthNumber, sixthNumber);
                theView.setCalcSolution3(theModel.getCalculationValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter two Integers");
            }
        }
    }
        class CalculateListener4 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int seventhNumber, eigthNumber = 0;

            try{
                seventhNumber = theView.getSeventhNumber();
                eigthNumber = theView.getEigthNumber();
                if (eigthNumber == 0){
                                    theView.displayErrorMessage("Divide by 0 Error");
                                } else{
                theModel.divideTwoNumbers(seventhNumber, eigthNumber);
                                
                theView.setCalcSolution4(theModel.getCalculationValue());
                                }
            }

            catch(NumberFormatException ex){
                
                System.out.println(ex);
                
                theView.displayErrorMessage("You Need to Enter two Integers");
            }
        }
    }
}
