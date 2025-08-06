
package lab2;

import java.util.Scanner;

public class fourthProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Filing Status (married or single) : ");
        String status = input.next();
        
        System.out.println("Enter Taxable income : ");
        double income = input.nextDouble();
        
        double tax = 0;
        
        if(status.equalsIgnoreCase("single")){
            if(income <= 32000){
                tax = income * 0.10 ;
            }else{
                tax = 3200 + (income - 32000) * 0.25 ;
            }
        } 
        else if (status.equalsIgnoreCase("married")){
            if (income <= 64000) {
                tax = income * 0.10 ;
            } else{
                tax = 6400 + (income - 64000) * 0.25 ;
            }
        }
        System.out.println("Tax is : " + tax);
    }
}
