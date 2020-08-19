
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
    
    public static void insertionSort(int []arr){
        int size = arr.length;
        //point the array from the second element
        for (int i = 1; i < size; i++) {
            //storing element
            int value = arr[i];
            int j = i;
            System.out.println(value + " to be inserted.");
            //while loop iterate if index is greater than 0 and if adjacent element is greater than value
            while(j > 0 && arr[j-1] > value){
                //swap the element which are greater than current 
                //value one position ahead of their current position
                System.out.println(arr[j-1]+ " > " + value + ": shift.");
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = value;
            System.out.println("Insert: " + arr[j]);
        }
    }
}
