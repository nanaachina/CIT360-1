/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.util.*;

/**
 *
 * @author seth
 */
public class ArrayTest {
    
    public static int[] main(int[] input){
        
        int[] iArr = input;
        
        System.out.println(Arrays.toString(iArr));
        
        Arrays.sort(iArr);
        
        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(iArr));

        return iArr;
    }
    
}
