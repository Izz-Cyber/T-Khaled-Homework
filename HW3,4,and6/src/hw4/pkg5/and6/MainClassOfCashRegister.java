
package hw4.pkg5.and6;

public class MainClassOfCashRegister {
    public static void main(String[] args){
        CashRegister cr  = new CashRegister();
        
        cr.scanItem(30);
        cr.scanItem(20);
        cr.depositMoney(60);
        cr.displayDetails();
    }
}
