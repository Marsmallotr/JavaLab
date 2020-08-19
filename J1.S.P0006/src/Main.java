
import java.util.Scanner;

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
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
//        System.out.println("Enter number of array: ");
//        int num = Validate.inputInt();
//        int []array = Manager.randomArray(num);
        //test array
        int []array = {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        
        System.out.println("Enter search value: ");
        int value = Validate.inputInt();
        
        //print the result and sorted array
        Manager.bubbleSort(array);
        Manager.printResult(array, value, 0 , array.length-1);
        
        
        
        
    }
}
