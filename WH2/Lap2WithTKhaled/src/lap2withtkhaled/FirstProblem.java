
package lap2withtkhaled;

import java.util.Scanner;


public class FirstProblem {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter nmber : ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        System.out.println("=================output===============");
        
        if(x>y){
            System.out.println(x);
        }
        else{
        System.out.println(y);
    }
    
}
}
