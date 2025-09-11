
package hw5_2_;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Sana'a", "Sana'a Street");
        
        Employee employee1 = new Employee("Ali", 25, address1);
        
        System.out.println(employee1.toString());
    }
}
