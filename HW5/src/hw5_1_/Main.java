
package hw5_1_;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ali", 20, "CYN");
        System.out.println("Student Details : \n"+student1.toString());
        System.out.println("-------------------------------------------------");
        
        Instructor instructor1 = new Instructor("Ali", 2002, 100000.0);
        System.out.println("Instructor Details : \n"+instructor1.toString());
        System.out.println("-------------------------------------------------");
    }
    
}
