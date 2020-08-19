
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
public class Internship extends Candidate{
    private String major;
    private String semester;
    private String university;

    public Internship() {
        super();
    }

    public Internship(String major, String semester, String university, String ID, String firstName, String lastName, String address, String phone, String email, int type, int birthDate) {
        super(ID, firstName, lastName, address, phone, email, type, birthDate);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    public void createInternship(ArrayList <Candidate> listCandi){
        System.out.println("===========INTERN CANDIDATE==============");
        super.createCandidate(listCandi);
        setType(2);
        System.out.print("Major: ");
        this.setMajor(inputHandle.inputString());
        System.out.print("Semeter: ");
        this.setSemester(inputHandle.inputString());
        System.out.print("University Name: ");
        this.setUniversity(inputHandle.inputString());
    }
    
}
