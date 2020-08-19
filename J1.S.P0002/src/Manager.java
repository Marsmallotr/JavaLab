
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
    
    public static void selectionSort(int []arr){
        //find the minimum element in array
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            //if there is an element smaller than min value -> set min = element
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
                
            }
            //swap element
        
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
        System.out.println("swap "+ arr[i] + " and " + arr[min]);
        printArray(arr);
        }
    }
}
