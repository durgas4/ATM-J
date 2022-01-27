import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Optionmenu extends Account{
	Scanner menuInput=new Scanner(System.in);// scanner class to take input from command line
	DecimalFormat money=new DecimalFormat("'$'##,##0.00");//money format is decimal format
	
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();//mapping pin number and ac number
	//get login method
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(19829,4326);// first integer customer no. and second pin
				data.put(35721,2948);
				
				System.out.println("Welcome to ATM project");
				//System.out.println("Welcome to ATM project");
				System.out.println("Enter your customer ID");
				setCustomerNumber(menuInput.nextInt());
				System.out.print("Enter ATM pin:");
				setPin(menuInput.nextInt());
							
			}catch(Exception e) {
				System.out.println("Please enter numbers only");
				x=2;
			}
				int cn=getCustomerNumber();
				int pn=getPin();
				if(data.containsKey(cn) && data.get(cn)==pn) {
					getActype();
				}
				else
					System.out.println("Invalid customer ID or pin");
								
			
		}while(x==1);
		
	}
	public void getActype() {

		System.out.println("Select the account you want to acess");
		System.out.println("Type 1-Current account");
		System.out.println("Type 2-Savings account");
		System.out.println("Type 3-Exit");
		System.out.println("Enter your choice:");
		
		int selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			getChecking();
			break;
		
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for banking with us");
			break;
		}


	}
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw amount");
		System.out.println("Type 3-Deposit funds");
		System.out.println("Type 4-Exit");
		
		int selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("The current account balance is :"+ moneyformat.format(getcheckingBalance()));
			getActype();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getActype();
			break;
			
		case 3:
			getCheckingDepositInput();
			getActype();
			break;
			
		case 4:
			System.out.println("Thanks for banking with us :)");
			break;
		}
		
	}
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw amount");
		System.out.println("Type 3-Deposit funds");
		System.out.println("Type 4-Exit");
		
		int selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("The saving account balance is :"+ moneyformat.format(getsavingBalance()));
			getActype();
			break;
			
		case 2:
			getsavingWithdrawInput();
			getActype();
			break;
			
		case 3:
			getSavingDepositInput();
			getActype();
			break;
			
		case 4:
			System.out.println("Thanks for banking with us :)");
			break;
		}
		
	}
}
