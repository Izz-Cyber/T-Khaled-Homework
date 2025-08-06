
package homework.lapone;

import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The First Number  : ");
        int a = input.nextInt();
        
        System.out.println("Enter The second Number : ");
        int b = input.nextInt();
        
        System.out.println("Befor swapping : a = " + a + ",b = " + b);
        
        // temporary variable like in C++ lang
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping : a = " + a + ",b = " + b);
    }
}
