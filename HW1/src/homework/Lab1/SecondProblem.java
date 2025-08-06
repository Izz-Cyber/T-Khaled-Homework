
package homework.lapone;

import java.util.Scanner;

public class SecondProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("...The Program Will Requests from you 5 Subjects' Marks...");
        
        System.out.println("Enter The First Subject's Mark : ");
        int firstsub = input.nextInt();
        
        System.out.println("Enter The Second Subject's Mark : ");
        int secondsub = input.nextInt();
        
        System.out.println("Enter The Therd Subject's Mark : ");
        int therdsub = input.nextInt();
        
        System.out.println("Enter The Fourth Subject's Mark : ");
        int fourthsub = input.nextInt();
        
        System.out.println("Enter The Fifth Subject's Mark : ");
        int fifthsub = input.nextInt();
        
        double average = (firstsub + secondsub + therdsub + fourthsub + fifthsub) / 5 ;
        System.out.println("The Average of This five Subjects is : " +average);
    }
}
