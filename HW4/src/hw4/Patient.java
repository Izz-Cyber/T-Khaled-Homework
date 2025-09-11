
package hw4;

import java.time.LocalDate;

public class Patient extends Person {
    private int patientId;
    private LocalDate todayDate;
    
    public Patient(String name, int age, String gender, int patientId, LocalDate todayDate){
        super(name,age,gender);
        this.patientId = patientId;
        this.todayDate = todayDate;
    }
    
    public int getPatientId(){
        return patientId;
    }    
    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    
    public LocalDate getTodayDate(){
        return todayDate;
    }
    public void setTodayDate(LocalDate todayDate){
        this.todayDate = todayDate;
    }
    
    public String toString(){
        return super.toString()
                +"\nPatient Id      : "+getPatientId()
                +"\nMedical History : "+getTodayDate();
    }
}
    
