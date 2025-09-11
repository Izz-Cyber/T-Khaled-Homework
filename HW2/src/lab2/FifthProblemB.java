
package lab2;

import java.util.Scanner;

public class FifthProblemB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Value : ");
        int a = input.nextInt();
        System.out.println("Enter Value : ");
        int b = input.nextInt();
        
        int sumOdd = 0;
        
        for(int odd = a; odd <= b; odd++){
            if(odd % 2 != 0){
                sumOdd += odd;
            }
        }
        System.out.println("The Sum of Odd Numbers between " +a+ " and " +b+ " is : " + sumOdd);
    }
}
