
package lap2withtkhaled;

import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Number : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int d = (a>b && a>c) ? a : ((b>a && b>c) ? b : c) ;
        
        System.out.println("The Biggest Number is " + d);
    }
 
}
