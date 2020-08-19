
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
    public static int inputInt(){
        //loop end when the user input is in right form
        while(true){
            try{
                int input = Integer.valueOf(in.nextLine());
                if(input<0){
                    throw new Exception();
                }
                return input;
            }catch(NumberFormatException ex){
                System.out.println("Wrong,you must enter a number");
                System.out.print("Enter a number : ");
            }catch(Exception ex){
                System.out.println("Wrong,you can't enter negative number!!!");
                System.out.print("Enter the number again: ");
            }
        }
    }
    
    public static int inputNumberInRange(int min,int max, String msg){
        //loop end when the user input is in right form
        while(true){
            try{
                int input = Integer.valueOf(in.nextLine());
                if(input < min || input > max){
                    throw new Exception();
                }
                return input;
            }catch(NumberFormatException ex){
                System.out.println("Wrong,you must enter a number");
                System.out.print("Enter the number : ");
            }catch(Exception ex){
                System.out.println(msg);
                System.out.print("Enter again: ");
            }
        }
    }
}
