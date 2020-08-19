
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
public class Validate {
    static Scanner in = new Scanner(System.in); 
     //check if the positive number is validate 
    public static int inputInt(){
        //loop end when the user input is in right form
        while(true){
            try{
                int input = Integer.valueOf(in.nextLine());
                if(input<1){
                    throw new Exception();
                }
                return input;
            }catch(NumberFormatException ex){
                System.out.println("Wrong,you must enter a number");
                System.out.println("Enter the number : ");
            }catch(Exception ex){
                System.out.println("Wrong,you must enter the number greater than 0");
                System.out.println("Enter the number again: ");
            }
        }
    }
}
