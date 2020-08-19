
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
public class Fresher extends Candidate{
    private int graduationDate;
    private String graduationRank, education;

    public Fresher() {
        
    }

    public Fresher(int graduationDate, String graduationRank, String university, String ID, String firstName, String lastName, String address, String phone, String email, int type, int birthDate) {
        super(ID, firstName, lastName, address, phone, email, type, birthDate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = university;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String university) {
        this.education = university;
    }
    
    public void createFresher(ArrayList <Candidate> lc){
        System.out.println("==========FRESHER CANDIDATE==============");
        super.createCandidate(lc);
        setType(1);
        System.out.print("Graduation Date: ");
        this.setGraduationDate(inputHandle.inputGraduateDate(getBirthDate()));
        System.out.print("Rank of Graduation: ");
        this.setGraduationRank(inputHandle.inputGraduationRank());
        System.out.print("Education: ");
        this.setEducation(inputHandle.inputString());
    }
}
