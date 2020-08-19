
import java.util.ArrayList;
import java.util.List;

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
        Manager m = new Manager();
        int []bill = m.bill();
        int wallet = m.wallet();
        m.display(bill, wallet);
    }
}