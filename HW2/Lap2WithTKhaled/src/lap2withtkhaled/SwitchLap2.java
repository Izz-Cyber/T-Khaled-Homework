
package lap2withtkhaled;

import java.util.Scanner;

public class SwitchLap2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of day : ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuseday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thesrday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invaild value...");
        }
                   
        }
        
}

