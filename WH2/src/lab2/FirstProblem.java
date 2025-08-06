
package lab2;

import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Richer scale value (integer) : ");
        int richter = input.nextInt();
        
        if(richter >= 8){
            System.out.println("Most Structures Fall.");
        }
        else if(richter == 7){
            System.out.println("Many Buildings Destroyed.");
        }
        else if(richter == 6){
            System.out.println("Many Buildings Considerably damaged, Some Collapse.");
        }
        else if(richter == 5){
            System.out.println("Damage to Poorly Constructed Buildings.");
        }
        else{
            System.out.println("No Effect.");
        }
    }
}
