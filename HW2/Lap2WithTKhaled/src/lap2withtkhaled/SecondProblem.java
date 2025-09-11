
package lap2withtkhaled;

import java.util.Scanner;

public class SecondProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Number : ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        int c = (a>b) ? a : b ;
        System.out.println(c+ " is The Greater Number...");
        
        
    }
}
