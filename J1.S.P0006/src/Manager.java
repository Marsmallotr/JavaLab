
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
    
    public static int binarySearch(int []arr, int key, int left, int right){
        int mid ;
        if(left > right){
            return -1;
        }
        mid = (left+right)/2;
        if(arr[mid] == key){
            System.out.println("middle element " +arr[mid]+ " == " +key);
            return mid;
        }  
        else if(arr[mid] > key){
            //recall the function to search on the left of the array
            System.out.println("middle element " +arr[mid]+ " > " +key);
            return binarySearch(arr, key, left, mid-1);
        }
        else if(arr[mid] < key){
            //recall the function to search on the right of the array
            System.out.println("middle element " +arr[mid]+ " < " +key);
            return binarySearch(arr, key, mid+1, right);
        }
        
        return mid;
    }
    
    public static void printResult(int []arr, int key, int left, int right){
        int result = Manager.binarySearch(arr, key, left, right);
        if(result == -1){
            System.out.println("Value not found !!!");
        }else{
        for (int i = 0; i < right; i++) {
            if(arr[i] == key)
            System.out.println("Found " + key + " at " + i);
            }
        }
    }
    
    public static void bubbleSort(int []arr){
        int n = arr.length;
        //compare 2 near number 
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                //swap if the number is greater than its previous
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    //test algorithm
//                    System.out.println(arr[j]+ " > " +arr[j-1] + " swap");
//                }else{
//                System.out.println(arr[j-1]+ " < " +arr[j] + " OK ");               
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



