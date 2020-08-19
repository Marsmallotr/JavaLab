

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trungdbkhe140257
 */
public class Main {
    static Scanner in = new Scanner(System.in); 

    public static void main(String[] args) {
        
        System.out.println("Enter number of array: ");
        int n = Validate.inputInt();
        
        System.out.println("Enter search value");
        int value = Validate.inputInt();
        int []arr = Manager.randomArray(n);
        
        int result = Manager.linearSearch(arr, value);
        Manager.printArray(arr);
        Manager.printResult(value, result);
        
        
    }
}
