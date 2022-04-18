//import java.util.Scanner;
public class SavingsAccount extends Account {
    
    public void calculateInterest(double amount){
        double interest;
        interest = amount *0.05;
        System.out.println("Your interest of just the initial balance is "+interest+"%");
    }
    
}
