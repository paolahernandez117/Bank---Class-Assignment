


public class Account {
    double interest;
    double currentBalance;
    double balance;

    public void deposit(double amount){
        balance =0.0;
        currentBalance = balance+amount;
        //System.out.println("Deposit amount: $"+amount);
        //System.out.println("Current Balance is: $"+currentBalance);
    }
    public void ndeposit(double namount){
        balance =currentBalance;
        currentBalance = balance+namount;
        System.out.println("Deposit amount: $"+namount);
        System.out.println("Current Balance is: $"+currentBalance);
        System.out.println("________________________________________");
        
    }
    public void checkBalance(){
        balance =currentBalance;
        currentBalance = balance;
        System.out.println("Verification of Current Balance is: $"+currentBalance);
        System.out.println("________________________________________");
    }

    public void withdrawal(double wamount){
        if(wamount>currentBalance){
            System.out.println("Debit amount exceeded account balance."); 
            System.out.println("________________________________________");
        }
        else{
            currentBalance = currentBalance-(wamount);
            System.out.println("Withdrawal amount: $"+wamount);
            System.out.println("Current Balance is: $"+currentBalance);
            System.out.println("________________________________________");
        }
        
        
    }

   







   





   
   

   



}
