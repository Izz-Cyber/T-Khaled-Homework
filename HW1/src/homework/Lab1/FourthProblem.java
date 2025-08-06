
package homework.lapone;

import java.util.Scanner;

public class FourthProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter A Number : ");
        double number = input.nextDouble();
        
        double square = number * number ;
        double cube = number * number * number ;
        double fourthPower = Math.pow(number, 4);
        
        System.out.println("Square : " + square);
        System.out.println("Cube   : " + cube);
        System.out.println("Fourth Power : " + fourthPower);
    }
}
