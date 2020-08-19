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
    public int []bill(){
        System.out.print("Enter number of bill: ");
        int size = Validate.inputNumberInRange(1, Integer.MAX_VALUE, "You should enter more bill");
        int []bill = new int[size];
        // input number of bill 
        for (int i = 0; i < size; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": " );
            bill[i] = Validate.inputInt();
        }
        return bill;
    }
    
    public int wallet(){
        System.out.print("\nInput value of wallet: ");
        int wallet = Validate.inputInt();
        return wallet;
    }
    
    public int totalBill(int []bill){
        int total = 0;
        //loop through bill array to get total money
        for (int i = 0; i < bill.length; i++) {
            total += bill[i];
        }
        return total;
    }
    
    public void display(int []bill, int wallet){
        int total = totalBill(bill);
        System.out.println("\nThis is total of bill: " + total);
        if(total <= wallet){
            System.out.println("You can buy it.");
        }else{
            System.out.println("You can't buy it.");
        }
    }
}
