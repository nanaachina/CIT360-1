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
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(33);
		
		//Retrieving
		System.out.println(numbers.get(2));
		
		//indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("index " + i + ": " + numbers.get(i));
		}
		
            //interate over collection
            numbers.forEach((value) -> {
                System.out.println(value);
            });
		
		//Removing is Slow - copies the collection into new one
		numbers.remove(0);
		
		//List interface
		List<String> listStrings = new ArrayList<>();
		
	}

}