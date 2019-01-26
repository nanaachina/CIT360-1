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
        
        System.out.println("\nTreeSet Demo:");
        collections.treeSetDemo();
        
        System.out.println("\nLinkedList Demo:");
        collections.linkedListDemo();
        
        System.out.println("\nHashMap Demo:");
        collections.hashMapDemo();
        
        System.out.println("\nTreeMap Demo:");
        collections.treeMapDemo();
        
    }
    
    private void arrayListDemo() {
        
        // Create ArrayList
        ArrayList<String> friendsList = new ArrayList<>();
        ArrayList<String> mehList = new ArrayList<>();
        
        // Add items to ArrayList
        friendsList.add("Shawn");
        friendsList.add("Randy");
        friendsList.add("Reed");
        
        // Add a new item, in an different position in ArrayList
        friendsList.add(1, "Nathan"); 
        
        // Display the contents of an ArrayList
        System.out.println("Test 1: Displaying contents of ArrayLists");
        System.out.println("Friends:\n" + friendsList);
        System.out.println("Meh:\n" + mehList);
        
        // Check to see if the ArrayList is empty
        System.out.println("Test 2: Checking if the ArrayLists are empty");
        
        boolean checkFriendsList = friendsList.isEmpty();
        boolean checkmehList = mehList.isEmpty();
        
        System.out.println("Your friends list is empty: " + checkFriendsList);
        System.out.println("Your list of people you feel 'Meh' about is empty: " + checkmehList);
        
        // Check for content
        System.out.println("Test 3: Check if the name already exists in an ArrayList");
        
        boolean containsShanelle = friendsList.contains("Shanelle");
        boolean containsRichard = friendsList.contains("Richard");
        
        System.out.println("Shanelle is in friend list: " + containsShanelle);
        System.out.println("Richard is in friend list: " + containsRichard);
        
        // Get contents of ArrayList based on index
        System.out.println("Test 4: Get contents of ArrayList based on index");
        
        try {
            String name = friendsList.get(1);
        
            System.out.println("Friend # 2 is " + name);
        }
        
        catch (Exception e) {
            
            System.out.println("Out of range.  You only have " + friendsList.size() + " friends.… You suck. :(");
            
        }
        
        try {
            String emptyName = friendsList.get(10);
        
            System.out.println("Friend # 10 is " + emptyName);
        }
        
        catch (Exception e) {
            
            System.out.println("Out of range.  You only have " + friendsList.size() + " friends.");
            
        }
        
        // Removing elements from the ArrayList
        System.out.println("Test 5: Removing elements from the ArrayList");
        
        friendsList.remove("Chad");
        friendsList.remove("Richard");
        
        System.out.println("Friends:\n" + friendsList);
        
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
        
        // Add to the beginning and end of existing list
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
        System.out.println("Add a new value… Maybe?!");
        list.add("Zero");
        
        System.out.println(list); // "Zero" gets added to the end of the list, unless you specify that it be inserted first
        
        // Add "Zero," but to the beginning
        System.out.println("Add 'Zero' to the beginning of the list");
        list.addFirst("Zero");
        
        System.out.println(list);
        
        // What happens when you remove "Zero"?
        System.out.println("Remove 'Zero'… but which one is it?");
        list.remove("Zero");
        
        // It will remove the first occurrence of the word "Zero." Let's add it back to the beginning and try to get rid of the last occurrence
        list.addFirst("Zero");
        
        System.out.println(list);
        
        System.out.println("It removed the first occurrence of 'zero,' Hmm… let's add it back in and remove the last iteration of 'Zero' instead.");
        list.removeLastOccurrence("Zero");
        
        System.out.println(list);
        
        // Attempt to add an Integer
        System.out.println("Does an exception throw when we try to add an integer to the list of strings?");
        list.add(1);
        
        System.out.println(list);
        
    }
    
    private void hashMapDemo() {
        
        // Create an empty HashMap
        HashMap map = new HashMap();
        ArrayList<String> friendsList = new ArrayList<>();
        
        // Add items to the ArrayList
        friendsList.add("Chad");
        friendsList.add("Shanelle");
        friendsList.add("Autumn");
        
        // Add values to the HashMap
        map.put("Name", "Chad");
        map.put("Age", 38);
        
        // Attempt to add an ArrayList as a value
        map.put("Friends", friendsList);
        
        System.out.println(map);
        
        System.out.println("Name: " + map.get("Name"));
        System.out.println("Age: " + map.get("Age"));
        
        // To get the friends list to print out properly we have to iterate through it
        System.out.println("Friends: ");
        
        ListIterator iterator = friendsList.listIterator();
        
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
        abcMap.put("Age", 38);
        abcMap.put("Hometown", "Minneapolis");
        
        System.out.println(intMap.toString());
        
        System.out.println(abcMap.toString());
        
        // Add new value to fill the 2 position
        intMap.put(2, "Shanelle");
        
        // Add new value to abcMap
        abcMap.put("Acrobatic Skill", "Needs improvement… To say the least.");
        abcMap.put("Parenting", "Awesome!");
        
        System.out.println(intMap.toString());
        
        System.out.println(abcMap.toString());
        
    }
    
}
