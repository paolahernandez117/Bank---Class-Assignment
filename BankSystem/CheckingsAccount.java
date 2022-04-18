//import java.util.Scanner;
public class CheckingsAccount extends Account {
    

   
    public void ndeposit(double namount){
        
        balance =currentBalance;
        currentBalance = balance+namount-(2);
        System.out.println("Deposit amount: $"+namount);
        System.out.println("________________________________________");
        System.out.println("Current Balance ($2 Transaction Fee has been applied): $"+currentBalance);
        System.out.println("________________________________________");
        
    }

    public void withdrawal(double wamount){
        if(wamount>currentBalance){
            System.out.println("Debit amount exceeded account balance."); 
        }
        else{
            currentBalance = currentBalance-(wamount)-(2);
            System.out.println("Withdrawal amount: $"+wamount);
            System.out.println("________________________________________");
            if(currentBalance<0){
                System.out.println("CANNOT DO TRANSACTION. With the $2 Transaction Fee applied your bank account will become a negative amount.");
                System.out.println("Thank you!");
            }
            else{
                System.out.println("Current Balance($2 Transaction Fee has been applied) is: $"+currentBalance);
            }
            
        }
        
        
    }










    public void checkBalance(){
        balance =currentBalance;
        currentBalance = balance;
        System.out.println("Verification of Current Balance is: $"+currentBalance);
    }
}
