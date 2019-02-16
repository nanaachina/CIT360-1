/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QCJSONattempt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;

/**
 *
 * @author seth
 */
public class QC_JSONDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nice Way - Write Object Out To File

        System.out.println("This creates an object string:");
        Guest donald = new Guest("Donald", "Duck", 3493, 40);

        try {
            String jsonString = JSONUtilities.stringify(donald);
            System.out.println(jsonString);
        } catch (JSONException e) {
            System.out.println("Error Creating File");
        }

        System.out.println("\nThis Writes the object string out to a file:");
        Guest mickey = new Guest("Mickey", "Mouse", 5423, 64);

        File guestFile = new File("guestFile.json");

        System.out.println(mickey + " has been written to a file.");

        try {
            FileOutputStream fileStream = new FileOutputStream(guestFile);
            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
            jsonOut.writeObject(mickey);
            jsonOut.close();
        } catch (Exception e) {
            System.out.println("Error Writing File Out");
        }

        // Read Object from file
        System.out.println("\nThis reads the object string in from a file:");

        try {
            FileInputStream guestIn = new FileInputStream(guestFile);
            JSONInputStream jsonIn = new JSONInputStream(guestIn);
            HashMap jsonMap = (HashMap) jsonIn.readObject();
            jsonIn.close();

            Guest getInfo = new Guest();
            long age = (long) jsonMap.get("age");
            long guestId = (long) jsonMap.get("guestId");
            getInfo.setAge((int) age);
            getInfo.setguestId((int) guestId);
            getInfo.setFirstName((String) jsonMap.get("firstName"));
            getInfo.setLastName((String) jsonMap.get("lastName"));

            String outputString = JSONUtilities.stringify(getInfo);
            System.out.println(outputString);
        } catch (Exception e) {
            System.out.println("Error Reading File Input");

        }

        // Error formats - image files
        try {
            FileInputStream fileOut = new FileInputStream("img.jpg");
            JSONInputStream jsonIn = new JSONInputStream(fileOut);
            jsonIn.close();

        } catch (Exception e) {
            System.out.println("\nCannot Read File: IMG");

        }
        // Null Obects
        try {
            FileInputStream fileInput = new FileInputStream("test1.txt");
            JSONInputStream jsonIn = new JSONInputStream(fileInput);

            HashMap jsonMap = (HashMap) jsonIn.readObject();
            jsonIn.close();
        } catch (Exception e) {
            System.out.println("\nCannot Read an Empty File");

        }
    }

}
