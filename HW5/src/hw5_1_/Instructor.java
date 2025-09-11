
package hw5_1_;

public class Instructor extends Person {
    private double salary ;

    

    public Instructor( String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }
    
    
    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return super.toString()+
                "\nSalary : "+salary;
    }
    
    
}
