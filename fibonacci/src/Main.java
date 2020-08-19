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
    public static int checkFibonacci(int n, int lower, int higher){
        //condition to exit recursive
        
        if(n == 0){
            return n;
        }else{
            System.out.print(lower + "(" + n + ")" +", " );
            //call the function again
            return checkFibonacci(n - 1, higher, higher + lower);
        }
    }
    
    public static void main(String[] args) {
        checkFibonacci(45, 0, 1);
    }
    
}
