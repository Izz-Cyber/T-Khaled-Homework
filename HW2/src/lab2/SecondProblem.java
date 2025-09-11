
package lab2;

import java.util.Scanner;

public class SecondProblem {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int number = num.nextInt();
        
        if (number % 2 == 0){
            System.out.println(number + " is Even Number...");
        }
        else if (number % 2 == 1){
            System.out.println(number + " is Odd Number...");
        }
        else{
            System.out.println("Error! invaled Value!?");
            System.out.println("Try Again...");
        }
    }
    
}
