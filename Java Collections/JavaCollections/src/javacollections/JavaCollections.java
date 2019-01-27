/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author seth
 */
import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // ArrayList example
        List one = new ArrayList();
        one.add("Autumn (39)");
        one.add("Ruth (53)");
        one.add("Christina (57)");
        one.add("Seth (37)");
        one.add("Stephen (Deceased)");
        System.out.println("\n\nLists Example: \n");
        System.out.println("My Parents' Children");
        
        Iterator kids = one.iterator();
        while(kids.hasNext()) {
        Object element = kids.next();
        System.out.print(element + "\n");
        }
        
        System.out.print("\n");        
        
        // Set example
        System.out.println("Set Collections Example");
        int advance[] = {2,9,4,0,3,1,5};
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 7; i++) {
            set.add(advance[i]);
        }
        System.out.println(set + "\n");

        //  Map example
        System.out.println("HashMap Example");
        Map hmap = new HashMap();
        hmap.put("Joseph Smith Jr.", "1830 - 1844");
        hmap.put("Brigham Young", "1847 - 1877");
        hmap.put("John Taylor", "1880 - 1887");
        hmap.put("Wilford Woodruff", "1889 - 1898");
        hmap.put("Lorenzo Snow", "1898 - 1901");
        
        System.out.println("The presidents of the Church are: \n");
        
        hmap.forEach((k,v) -> System.out.println("President - " + k 
                + ", Presided from " + v + "\n"));
        
        
        // Tree example
        System.out.println("TreeSet Example. Now With Actual Trees!");
        TreeSet baum = new TreeSet();
        baum.add("Magnolia");
        baum.add("Elm");
        baum.add("Pecan");
        baum.add("Pine");
        baum.add("Maple");
        baum.add("Wysteria");
        baum.add("Aspen");
        
        Iterator list = baum.iterator();
        while(list.hasNext()) {
        Object element = list.next();
        System.out.print(element + "\n");
        }
        
        
        // Queue example
        System.out.println("\nQueue Example. With birds in German, because why not.");
        Queue<String> warteschlange = new LinkedList<>();
        
        warteschlange.add("Huhn");
        warteschlange.add("Hahn");
        warteschlange.add("Taube");
        warteschlange.add("Ente");
        warteschlange.add("Amsel");
        
        warteschlange.forEach(name -> {
           System.out.println(name);
        });

    }
    
}
