import java.util.Scanner;
public class Test {
    //enum typeofAccount {SAVINGS, CHECKING};
    public static void main(String[]args){
        CheckingsAccount CheckingsAccountObject = new CheckingsAccount();
        Account AccountObject = new Account();
        SavingsAccount SavingsAccountObject = new SavingsAccount();
        
        Scanner in = new Scanner (System.in);
        System.out.println("\nWelcome to PH Bank Systems! \n Our Interest Rate is 5% and for Checking Accounts we do have a $2 transaction fee. \nIn order to open an account you must make an initial deposit. Enter the amount you want to deposit: ");
        double amount = in.nextDouble();
            AccountObject.deposit(amount);
            CheckingsAccountObject.deposit(amount);
            //SavingsAccountObject.calculateInterest(amount);
        
        System.out.println("\nWhat type of account would you like to open? \n1: Savings \n2: Checkings:");
		int choice = in.nextInt();
		String account = " ";
		
		
		switch(choice){
		    case 1: account = "Savings"; break;
		    case 2: account = "Checkings"; break;
		    
            default: account = "ERROR"; break;
		}
	

		System.out.println("\nCongratulations! You opened a "+account+" account");

        if(choice == 1){
            System.out.println("\nWhat would you like to do? \n1: Deposit \n2: Withdraw \n3: Check Balance");
            int action = in.nextInt();

            if(action == 1){
                System.out.println("\nEnter the amount you want to deposit: ");
            double namount = in.nextDouble();
            
            AccountObject.ndeposit(namount);
            SavingsAccountObject.calculateInterest(amount);
            }
            if (action ==2 ){
                System.out.println("\nEnter amount you want to withdraw: ");
            double wamount = in.nextDouble();
            AccountObject.withdrawal(wamount);
            }
            else{
                AccountObject.checkBalance();
            }

        }
        if(choice == 2){
            System.out.println("\nWhat would you like to do? \n1: Deposit \n2: Withdraw \n3: Check Balance");
            int action = in.nextInt();

            if(action == 1){
                System.out.println("\nEnter amount you want to deposit: ");
            double namount = in.nextDouble();
            CheckingsAccountObject.ndeposit(namount);
            }
            if (action ==2 ){
                System.out.println("\nEnter amount you want to withdraw: ");
            double wamount = in.nextDouble();
            CheckingsAccountObject.withdrawal(wamount);
            }
            if(action ==3){
                AccountObject.checkBalance();
            }

        }
        else{

        }

    }
    
}
