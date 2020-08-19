
import java.util.ArrayList;
import java.util.Calendar;

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
    public int menu(){
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = inputHandle.inputNumberInRange(1, 5, "Please input number betwwen 1 - 5");
        return choice;
    }
    
    public void searchCandidate(ArrayList <Candidate> listCandi){
        System.out.println("=====Search=====");
        System.out.print("Input Candidate name (First name or Last name): ");
        String name = inputHandle.inputString();
        System.out.print("Input type of candidate: ");
        int type = inputHandle.inputNumberInRange(0, 2, "You must input number between 0-2");
        boolean search = false;
        //check if type, first name and last name matched
        for (Candidate candidate : listCandi) {
            if(type == candidate.getType() 
                    && (candidate.getFirstName().toLowerCase().contains(name.toLowerCase().trim())
                    || candidate.getLastName().toLowerCase().contains(name.toLowerCase().trim()))){
                System.out.println("The candidates found: ");
                System.out.println(candidate.toString());
                search = true;
            }
        }
        if(!search){
            System.out.println("\nNot existed !!!");
        }
    }
    
    public void printList(ArrayList <Candidate> listCandi){
        System.out.println("List of candidate: ");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate candidate : listCandi) {
            if(candidate instanceof Experience){
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Candidate candidate : listCandi) {
            if(candidate instanceof Fresher){
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        
        System.out.println("===========INTERN CANDIDATE==============");
        for (Candidate candidate : listCandi) {
            if(candidate instanceof Internship){
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }
}
