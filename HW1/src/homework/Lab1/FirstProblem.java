
package homework.lapone;

import java.util.Scanner;

public class FirstProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle : ");
        double radius = input.nextDouble();
        
        double area = 3.14 * radius *radius;
        
        double perimeter = 2 * 3.14 * radius;
        
        System.out.println("Area of circle : " +area);
        System.out.println("Perimeter of the circle : " +perimeter);
    }
    
}
