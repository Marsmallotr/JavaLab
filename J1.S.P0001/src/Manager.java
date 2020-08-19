
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
    public static int[] randomArray(int input){
        Random rd = new Random();
        int []arr = new int[input];
        //insert random number from 0 to the number user input to array 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(input+1);   
        }
        return arr;
    }
    
    public static void printArray(int []arr){
        System.out.print("Current array: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1){
            System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
    
    public static void bubbleSort(int []arr){
        int n = arr.length;
        //go over the array from first index
        for (int i = 0; i < n; i++) {
            //go over the array from second index
            for (int j = 1; j < n-i; j++) {
                //swap if the number is greater than its previous
                if(arr[j-1] > arr[j]){
                    printArray(arr);
                    System.out.println(arr[j-1]+ " > " +arr[j] + " swap" );
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    //test algorithm
                }else{
                    printArray(arr);
                    System.out.println(arr[j-1]+ " < " +arr[j] + " OK ");            
                }
            }
        }
        //print the sorted array
        System.out.print("Sorted array: ");
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
}
