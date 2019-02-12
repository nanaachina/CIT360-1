/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPattern;

import java.util.HashMap;

/**
 *
 * @author seth
 */
public class ApplicationControllerPattern {

    public static HashMap<String,HandleMath> hashMapOfCommands = new HashMap<String,HandleMath>();

    public void ApplicationControllerPat(){

    }

    public static void handleCommand(String command, Integer num1, Integer num2){

        hashMapOfCommands.put("+", new Add());
        hashMapOfCommands.put("-", new Subtract());
        hashMapOfCommands.put("/", new Divide());
        hashMapOfCommands.put("*", new Multiply());

        HandleMath handler = hashMapOfCommands.get(command);

        handler.execute(num1, num2);
    }

}

