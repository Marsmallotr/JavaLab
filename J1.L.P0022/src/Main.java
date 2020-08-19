
import java.util.ArrayList;

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
        ArrayList <Candidate> candidate = new ArrayList<>();
        while(true){
            int choice = m.menu();
            do{
                boolean go = false;
                switch(choice){
                    case 1:
                        Experience e = new Experience();
                        e.createExperience(candidate);
                        candidate.add(e);
                        break;
                    case 2:
                        Fresher f = new Fresher();
                        f.createFresher(candidate);
                        candidate.add(f);
                        break;
                    case 3:
                        Internship i = new Internship();
                        i.createInternship(candidate);
                        candidate.add(i);
                        break;
                    case 4:
                        m.printList(candidate);
                        m.searchCandidate(candidate);
                        go = true;
                        break;
                    case 5:
                        return;
                }
                if(go == false){
                    if(!inputHandle.yesNo()){
                        m.printList(candidate);
                        break;
                    }
                }else{
                    break;
                }
            }while(true);
        }
    }
}
