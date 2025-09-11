
package hw4;

public class Doctor extends Person{
    private int doctorId;
    private String specialization;
    
    public Doctor(String name, int age, String gender, int doctorId, String specialization){
        super(name,age,gender);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }
    
    public int getDoctorId(){
        return doctorId;
    }
    public void setDoctorId(int doctorId){
        this.doctorId = doctorId;
    }
    
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    
    public String toString(){
        return super.toString()+
                "\nDoctor Id      : "+getDoctorId()+
                "\nSpecialization : "+getSpecialization();
    }
}
