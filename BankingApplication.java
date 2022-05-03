import java.util.Scanner;

public class BankingApplication {
	
	public static void main(String[] args) {
		bankAccount obj1 = new bankAccount("Areto Brenda", "67890");
		obj1.showMenu();
	}
		
	}

	
class bankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	bankAccount(String cname, String cid) {
		
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		
		if(amount != 0 ) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0)
		{	
			balance = balance - amount;
			previousTransaction = -amount;
			
		}	
		
	}
	
	void getpreviousTransaction() {
		if(previousTransaction > 0) {
			
			System.out.println("Deposited: "+previousTransaction);
		}
		else 
			if(previousTransaction < 0) {
				
			System.out.println("Withdrawn "+Math.abs(previousTransaction));
		}
		
		else {
			System.out.println("No transaction occured!");
			
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome: "+customerName);
		System.out.println("Your Id is: "+customerId);
		System.out.println("\n");
		System.out.println("A. Check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		
	
	

	
	do {
		System.out.println("====================================================");
		System.out.println("Enter option");
		System.out.println("=====================================================");
		option = scanner.next().charAt(0);
		System.out.println("\n");
		
		switch(option) {
		
		case 'A':
		
		System.out.println("..........................................");
		System.out.println("Balance = "+balance);
		System.out.println("...........................................");
		System.out.println("\n");
		
		break;
		case 'B':
			System.out.println("........................................");
			System.out.println("Enter an amount to be deposited");
			System.out.println(".........................................");
			int amount = scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C':
			System.out.println("..........................................");
			System.out.println("Enter amount to withdraw");
			System.out.println("...........................................");
			int amount2 = scanner.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
			
		case 'D':
			System.out.println("........................................");
			getpreviousTransaction();
			System.out.println(".........................................");
			System.out.println("\n");
			break;
		
			//default: // for a case when the user enters a wrong option
			//	System.out.println("Ivalid option!!. please enter again!");
				

		}
		
	} 
	while(option != 'E');
		 
			System.out.println("Thank you for banking with us");
		
			scanner.close();
	}	
			
		}
		


	
	



	



