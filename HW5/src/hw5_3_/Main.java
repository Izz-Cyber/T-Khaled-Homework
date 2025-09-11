
package hw5_3_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Numbers of Rows : ");
        int rows = input.nextInt();
        System.out.println("Enter The Number of Colums : ");
        int cols = input.nextInt();
        
        int [][] my2DArray = new int[rows][cols];
        
        System.out.println("Enter The Values Of Array : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.printf("Enter Value for Row and Colums : ");
                my2DArray[i][j] = input.nextInt();
            }
        }
        System.out.println("\n Array Content is : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println(my2DArray[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
