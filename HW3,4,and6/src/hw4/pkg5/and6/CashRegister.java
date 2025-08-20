
package hw4.pkg5.and6;

public class CashRegister {
    private double totalAmount;
    private double depositedMoney;
    
    public void scanItem(double price){
        totalAmount += price;
    }
    
    public void depositMoney(double money){
        depositedMoney +=  money;
    }
    
    public double getChange(){
        if(depositedMoney >= totalAmount){
            return depositedMoney - totalAmount;
        }
        else{
            System.out.println("Not enough money!");
            return 0;
        }
        
    }
    
    public void displayDetails(){
        System.out.println("Total: " +totalAmount+ ", Deposited: " +depositedMoney+ ", Change: " +getChange());
    }
    
    
}
