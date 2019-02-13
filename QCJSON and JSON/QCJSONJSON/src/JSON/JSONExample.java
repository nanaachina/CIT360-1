/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.IOException;
import java.io.StringWriter;
import json.simple.*;
import json.simple.parser.*;

/**
 *
 * @author seth
 */
public class JSONExample {
    
    public static void main(String[] args) throws IOException {
        //JSON Object example
        JSONObject obj = new JSONObject();
        
        obj.put("name", "Seth");
        obj.put("age", new Integer(37));
        obj.put("is_married", new Boolean(false));
        obj.put("occupation", "nerd");
        
        System.out.print(obj);
        
        System.out.println();
        
        //Stringwriter example
        StringWriter out = new StringWriter();
        obj.writeJSONString(out);
        
        String jsonText = out.toString();
        System.out.print(jsonText);
        
        //Decoding JSON example with JSONObject and JSONArray
        JSONParser parser = new JSONParser();
        String list = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
        
        try{
            Object obj2 = parser.parse(list);
            JSONArray array = (JSONArray)obj2;
            
            System.out.println();
            System.out.println("The 2nd Element of the array:");
            System.out.println(array.get(1));
            System.out.println();
            
            JSONObject obj3 = (JSONObject)array.get(1);
            System.out.println("Field \"1\"");
            System.out.println(obj3.get("1"));
            
            
            list = "{}";
            obj2 = parser.parse(list);
            System.out.println(obj2);

            list = "[5,]";
            obj2 = parser.parse(list);
            System.out.println(obj2);

            list = "[5,,2]";
            obj2 = parser.parse(list);
            System.out.println(obj2);
      }catch(ParseException pe){
		
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
            
        }    
    }
    
}
