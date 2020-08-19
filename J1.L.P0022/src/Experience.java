
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
public class Experience extends Candidate{
    private int yearExperience;
    private String professionalSkill;

    public Experience() {
        super();
    }

    public Experience(int yearExperience, String professionalSkill, String ID, String firstName, String lastName, String address, String phone, String email, int type, int birthDate) {
        super(ID, firstName, lastName, address, phone, email, type, birthDate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
    
    public void createExperience(ArrayList <Candidate> lc){
        System.out.println("===========EXPERIENCE CANDIDATE============");
        super.createCandidate(lc);
        setType(0);
        System.out.print("Professional skill: ");
        this.setProfessionalSkill(inputHandle.inputString());
        System.out.print("Experience years: ");
        this.setYearExperience(inputHandle.inputExperience(getBirthDate()));
    }
}
