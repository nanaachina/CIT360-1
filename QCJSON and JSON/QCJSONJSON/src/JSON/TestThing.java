/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

/**
 *
 * @author seth
 */

public class TestThing implements Serializable { 
    private String theString; 
    private int theInt; 
    private Date theDate;   
            
    public TestObject(String aString, int anInt, Date aDate) { 
    theString = aString; 
    theInt = anInt; 
    theDate = aDate; 
    } 

}

TestObject anInstance = new TestThing("Hello there.", 7, 
    new Date(1067899)); 
try { 
    String jsonString = JSONUtilities.stringify(anInstance); 
    System.out.println(jsonString); 
}
    catch (JSONException e) { 
    e.printStackTrace();  } 
}
