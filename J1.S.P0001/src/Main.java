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
//        int inputSize = Validate.inputInt();
//        int []array = Manager.randomArray(inputSize);
        int []array = {5, 1, 12, -5 ,16};
        Manager.printArray(array);
        Manager.bubbleSort(array);
    }
}
