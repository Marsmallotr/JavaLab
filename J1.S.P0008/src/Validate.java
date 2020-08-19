
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
    Scanner in = new Scanner(System.in);
    public String inputString(){
        while(true){
        String input = in.nextLine().trim();
        // check if string is empty or just space character
        if(input.isEmpty() || input.equals(" ")){
            System.out.println("Empty");
            System.out.println("Enter again");
        }else{
            return input;
        }   
        }
    }
}
