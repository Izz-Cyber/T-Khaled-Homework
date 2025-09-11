
package lab2;

import java.util.Scanner;

public class SixthProblem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Word : ");
        String word = input.next();
        
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
