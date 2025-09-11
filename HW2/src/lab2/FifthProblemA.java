
package lab2;

public class FifthProblemA {
    public static void main(String[] args) {
     
        int sumEven = 0;
        
        for (int even = 2; even <= 100; even+=2){
            sumEven += even;
        }
        System.out.println("The sum of even Numbers from 2 to 100 is : " +sumEven);
    }
}
