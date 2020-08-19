
import java.util.ArrayList;
import java.util.Calendar;
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
public class inputHandle {
    static Scanner in = new Scanner(System.in);
    public static String inputString(){
        while(true){
        String input = in.nextLine().trim();
        // check if string is empty or just space character
        if(input.isEmpty() || input.equals(" ")){
            System.out.println("Empty!!!");
            System.out.print("Enter again: ");
        }else{
            return input;
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
    
    public static boolean yesNo(){
        System.out.print("\nDo you want to continue: ");
        while(true){
            String input = in.nextLine();
            if(input.equalsIgnoreCase("Y")){
                return true;
            }
            if(input.equalsIgnoreCase("N")){
                return false;
            }
            System.out.println("Please input Y/N or y/n");
            System.out.print("Enter again: ");
        }  
    } 
    
    public static String inputPhone(){
        while(true){
            String input = in.nextLine();
            //if string have 10 number then return
            if(input.matches("^\\d{10}\\d*$")){
                return input;
            }else{
                System.out.println("Phone is number with minimum 10 numbers");
                System.out.print("Phone: ");
            }
        }
    }
    
    public static String inputEmail(){
        while(true){
            String input = in.nextLine();
            //if the email match regex string then return
            if(input.matches("[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$")){
                return input;
            }else{
                System.out.println("Email is string with format <account name>@<domain>.<domain>");
                System.out.print("Email: ");
            }
        }
    }
    
    public static String inputGraduationRank(){
        while(true){
            String input = in.nextLine();
            if(input.equalsIgnoreCase("Excellence")
                    || input.equalsIgnoreCase("Good")
                    || input.equalsIgnoreCase("Fair")
                    || input.equalsIgnoreCase("Poor")){
                return input;
            }
            System.out.println("Rank is one of 4 values (Excellence, Good, Fair, Poor)");
            System.out.print("Enter again: ");
        }  
    }
    
    public static int inputExperience(int birthDate){
        //get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthDate;
        while(true){
            int experienceYear = inputNumberInRange(1, age, "Experience years must be smaller than age: " + age);
            if(experienceYear > age){
                System.out.println("Experiment must be smaller than age");
            }else{
                return experienceYear;
            }
        }
    }
    
    public static int inputGraduateDate(int birthDate){
        //get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthDate;
        while(true){
            int graduateDate = inputNumberInRange(age, Integer.MAX_VALUE, "Graduate date must greater than birth date!!!");
            return graduateDate;
        }
    }
    
    public static boolean checkID(ArrayList <Candidate> lc, String ID){
        for (Candidate candidate : lc) {
            if(ID.equalsIgnoreCase(candidate.getID())){
                return false;
            }
        }
        return true;
    }
    
    public static String inputID(ArrayList <Candidate> lc){
        while(true){
        String input = inputString();
        // check if input ID duplicated
        if(!checkID(lc, input)){
            System.out.println("ID duplicated!!!");
            System.out.print("ID: ");
        }else{
            return input;
        }   
        }
    }
}
