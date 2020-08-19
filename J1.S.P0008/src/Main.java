
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
    public static void main(String[] args) {
        Validate validate = new Validate();
        System.out.println("Enter your content: ");
        String input = validate.inputString();

        Manager m = new Manager();
        System.out.println(m.letterCount(input));
        System.out.println(m.charCount(input));
    }
}
