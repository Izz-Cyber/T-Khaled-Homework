
package lab2;

import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int number = num.nextInt();
        
        if(number > 0){
            System.out.println(number + " is Positive...");
        }
        else if(number < 0){
            System.out.println(number + " is Negative...");
        }
        else if(number == 0){
            System.out.println(number + " is Zero...");
        }
        else{
            System.out.println("Error! Invaled Value!?");
            System.out.println("Try Again...");
        }
    }
}
