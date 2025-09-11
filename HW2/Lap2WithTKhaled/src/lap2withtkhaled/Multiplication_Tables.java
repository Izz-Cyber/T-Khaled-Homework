
package lap2withtkhaled;

public class Multiplication_Tables {
    public static void main(String[] args) {
        for(int a = 1; a <= 12; a++){
            System.out.println("Multiplication of " +a);
            for (int b = 1; b <= 12; b++){
                System.out.println(a+ " x " +b+ " = " + a*b);
            }
            System.out.println("************************************************");
        }
    }
}
