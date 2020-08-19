
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trungdbkhe140257
 */
public class Manager {
    
    public static int linearSearch(int []arr, int value){
        //loop from start to end to find the number equal to input
        for (int i = 0; i < arr.length; i++) {
            //if user input equal with the element in the array
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
 
    }
    
    //random a list of integer
    public static int[] randomArray(int n){
        Random rd = new Random();
        int []arr = new int[n];
        //loop to insert random number to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(n+1);   
        }
        return arr;
    }
    
    //print the list
    public static void printArray(int []arr){
        System.out.print("The array: ");
        System.out.print("[");
        //loop from start to print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1){
            System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
    
    
    public static void printResult(int value, int result){
        if(result == -1){
            System.out.println("Value not available in array");
        }else{
            System.out.println("Found " + value + " at index: " +result);
        }
    }
}
