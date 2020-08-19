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
    public static void main(String[] args) {
//        System.out.println("Enter number of array: ");
//        int size = Validate.inputInt();
//        int []arr = Manager.randomArray(size);
        
        int []arr = {5,1,12,-5,16,2,12,14};
        
        System.out.print("Unsorted array: ");
        Manager.printArray(arr);
        Manager.selectionSort(arr);
        System.out.print("Sorted array: ");
        Manager.printArray(arr);
    }
}
