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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeMap;

public class JavaCollections {
    
    public static void main(String[] args) {
        
        JavaCollections collections = new JavaCollections();
        
        System.out.println("ArrayList Demo:");
        collections.arrayListDemo();
        
        System.out.println("\nTreeSet Demo");
        collections.treeSetDemo();
        
        System.out.println("\nLinkedList Demo");
        collections.linkedListDemo();
        
        System.out.println("\nHashMap Demo");
        collections.hashMapDemo();
        
        System.out.println("\nTreeMap Demo");
        collections.treeMapDemo();
        
    }
    
    private void arrayListDemo() {
        
        // Create the ArrayList
        ArrayList<String> friendList = new ArrayList<>();
        ArrayList<String> mehList = new ArrayList<>();
        
        // Add items to the ArrayList
        friendList.add("Shawn");
        friendList.add("Randy");
        friendList.add("Reed");
        
        // Add a new item, but insert it earlier in the ArrayList
        friendList.add(1, "Nathan"); // The '1' indicates that this item will be added to the 2nd position
        
        // Display the contents of the ArrayList
        System.out.println("Test 1: Displaying contents of ArrayLists");
        System.out.println("Friends:\n" + friendList);
        System.out.println("Meh:\n" + mehList);
        
        // Check to see if an ArrayList is empty
        System.out.println("Test 2: Checking if the ArrayLists are empty");
        
        boolean checkFriendList = friendList.isEmpty();
        boolean checkmehList = mehList.isEmpty();
        
        System.out.println("Friend list is empty: " + checkFriendList);
        System.out.println("Meh list is empty: " + checkmehList);
        
        // Check if a name is in the list
        System.out.println("Test 3: Check if a name already exists in an ArrayList");
        
        boolean containsShanelle = friendList.contains("Shanelle");
        boolean containsRichard = friendList.contains("Richard");
        
        System.out.println("Shanelle is in friend list: " + containsShanelle);
        System.out.println("Richard is in friend list: " + containsRichard);
        
        // Get contents of ArrayList based on index
        System.out.println("Test 4: Getting contents of ArrayList based on index");
        
        try {
            String name = friendList.get(1);
        
            System.out.println("Friend # 2 is " + name);
        }
        
        catch (Exception e) {
            
            System.out.println("Out of range.  You only have " + friendList.size() + " friends.");
            
        }
        
        try {
            String emptyName = friendList.get(10);
        
            System.out.println("Friend # 10 is " + emptyName);
        }
        
        catch (Exception e) {
            
            System.out.println("Out of range.  You only have " + friendList.size() + " friends.");
            
        }
        
        // Removing elements from the ArrayList
        System.out.println("Test 5: Removing elements from the ArrayList");
        
        friendList.remove("Chad");
        friendList.remove("Richard");
        
        System.out.println("Friends:\n" + friendList);
        
    }
    
    private void treeSetDemo() {
        
        // Creating empty TreeSets
        TreeSet numberSet = new TreeSet();
        TreeSet nameSet = new TreeSet();
        TreeSet combinedSet = new TreeSet();
        
        // Entering a series of integers into numberSet
        numberSet.add(17);
        numberSet.add(28);
        numberSet.add(169);
        numberSet.add(1);
        
        System.out.println(numberSet.toString());
        
        // Entering a series of names into nameSet
        nameSet.add("Emmanuel");
        nameSet.add("Chad");
        nameSet.add("Abbie");
        nameSet.add("Aaron");
        
        System.out.println(nameSet.toString());
        
        // What happens when you try to mix datatypes?
        System.out.println("Attempting to mix Strings and Integers in the same set");
        try {
            
            combinedSet.add("Richard");
            combinedSet.add("Zachary");
            combinedSet.add(100);
            combinedSet.add(2);
            combinedSet.add(29);
            
            System.out.println(combinedSet.toString());
        
        }
        
        catch (Exception e) {
            
            System.out.println("Error inputting values.  Check that all value datatypes match.");
            
        }
        
    }
    
    private void linkedListDemo() {
        
        // Create an empty LinkedList
        LinkedList list = new LinkedList();
        
        // Add elements to the LinkedList
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        
        // Iterate through the list
        ListIterator iterator = list.listIterator();
        
        System.out.println("Before adding new elements:");
        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
            
        }
        
        // Add to beginning and end of existing list
        System.out.println("Add 'One' to the beginning and 'Seven' to the end of the list");
        list.addFirst("One");
        list.addLast("Seven");
        
        // Iterate through new list
        System.out.println("After adding new elements:");
        
        iterator = list.listIterator();
        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
            
        }
        
        // Attempt to add a new value
        System.out.println("Add a new value...where will it go?");
        list.add("Zero");
        
        System.out.println(list); // "Zero" gets added to the end of the list, unless you specify that it be inserted first
        
        // Add "Zero," but to the beginning
        System.out.println("Add 'Zero' to the beginning of the list");
        list.addFirst("Zero");
        
        System.out.println(list);
        
        // What happens when you remove "Zero" if the value occurs multiple times?
        System.out.println("Remove 'Zero'...but which one will be removed?");
        list.remove("Zero");
        
        // It automatically removes the first occurence of the word "Zero."  Let's add it back to the beginning and try to get rid of the last occurence
        list.addFirst("Zero");
        
        System.out.println(list);
        
        System.out.println("It removed the first occurrence of 'zero,' so let's add it back in and then remove the last iteration of 'Zero'");
        list.removeLastOccurrence("Zero");
        
        System.out.println(list);
        
        // Attempt to add an Integer
        System.out.println("Does an exception get thrown when we try to add an integer to a list of strings?");
        list.add(1);
        
        System.out.println(list);
        
    }
    
    private void hashMapDemo() {
        
        // Create an empty HashMap
        HashMap map = new HashMap();
        ArrayList<String> friendList = new ArrayList<>();
        
        // Add items to the ArrayList
        friendList.add("Chad");
        friendList.add("Shanelle");
        friendList.add("Autumn");
        
        // Add values to the HashMap
        map.put("Name", "Chad");
        map.put("Age", 26);
        
        // Attempt to add an ArrayList as a value
        map.put("Friends", friendList);
        
        System.out.println(map);
        
        System.out.println("Name: " + map.get("Name"));
        System.out.println("Age: " + map.get("Age"));
        
        // To get the friends list to print out properly we have to iterate through it
        System.out.println("Friends: ");
        
        ListIterator iterator = friendList.listIterator();
        
        while (iterator.hasNext()) {
            
            System.out.println("\t" + iterator.next());
            
        }
        
    }
    
    private void treeMapDemo() {
        
        // Create an empty TreeMap
        TreeMap intMap = new TreeMap();
        TreeMap abcMap = new TreeMap();
        
        // Add values to tMap
        intMap.put(1, "Chad");
        intMap.put(3, "Willard");
        intMap.put(4, "Autumn");
        
        abcMap.put("Name", "Chad");
        abcMap.put("Age", 26);
        abcMap.put("Hometown", "Denham Springs");
        
        System.out.println(intMap.toString());
        
        System.out.println(abcMap.toString());
        
        // Add new value to fill the 2 position
        intMap.put(2, "Shanelle");
        
        // Add new value to abcMap
        abcMap.put("Acrobatic Skill", "Bad");
        abcMap.put("Zoology Skill", "Decent");
        
        System.out.println(intMap.toString());
        
        System.out.println(abcMap.toString());
        
    }
    
}
