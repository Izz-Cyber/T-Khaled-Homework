
package lab2;

import java.util.Scanner;

public class FifthProblemC {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an Integer Value : ");
        int number = input.nextInt();
        
        int sum = 0 ;
        
        while(number > 0){
            int digit = number % 10 ;
            
            if(digit % 2 != 0){
                sum += digit ;
            }
            number /= 10 ;
        }
        System.out.println("The Sum of Odd Digits is : " +sum);
    }
}
