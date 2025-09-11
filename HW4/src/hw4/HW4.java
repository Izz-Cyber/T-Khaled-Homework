
package hw4;

import java.util.Scanner;
import java.time.LocalDate;

public class HW4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****************Patient****************");
        
        System.out.print("Enter Patient's Name : ");
        String Pname = input.nextLine();
        System.out.print("Enter Patient's Age : ");
        int Page = input.nextInt();
        input.nextLine();
        System.out.print("Enter Patient's Gender : ");
        String Pgender = input.nextLine();
        System.out.print("Enter Patient's Id : ");
        int Pid = input.nextInt();
        input.nextLine();
        /*System.out.print("Enter Medical History : ");
        String PmedicalHistory = input.nextLine();*/
        LocalDate todayDate = LocalDate.now();
        Patient p1 = new Patient(Pname,Page,Pgender,Pid,todayDate);
        
        
        System.out.println("********************** Out of Patient");
        System.out.println("\n\n"+p1.toString());
        System.out.println("\n\n");
        
        System.out.println("********************Doctor****************");
        
        System.out.print("Enter Doctor's Name : ");
        String Dname = input.nextLine();
        System.out.print("Enter Doctor's Age : ");
        int Dage = input.nextInt();
        input.nextLine();
        System.out.print("Enter Doctor's Gender : ");
        String Dgender = input.nextLine();
        System.out.print("Enter Doctor's Id : ");
        int Did = input.nextInt();
        input.nextLine();
        System.out.print("Enter Doctor's Specialization : ");
        String Dspecialization = input.nextLine();
        
        Doctor d1 = new Doctor(Dname,Dage,Dgender,Did,Dspecialization);
        
        System.out.println("********************** Out of Doctor");
        System.out.println("\n\n"+d1.toString());
        
        
        
        
        
        
        
        
        /*Patient p1 = new Patient("Ali",40,"male",1,"2025/8/22");
        Doctor d1 = new Doctor("Ahmed",28,"male",1,"Nutritionist");
        
        System.out.println("************Patient**************");
        System.out.println(p1.toString());
        System.out.println("************Doctor***************");
        System.out.println(d1.toString());*/
    }
    
}
