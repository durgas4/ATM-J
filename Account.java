import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat= new DecimalFormat("'$'##,##0.00");
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public int setPin(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
		
	}
    public int getPin() {
    	return pinNumber;
    }
    public double getcheckingBalance() {
    	return checkingBalance;
    }
    public double getsavingBalance() {
    	return savingBalance;
    }
    public double calcCheckingWithdraw(double amount) {
    	checkingBalance=(checkingBalance-amount);
    	return checkingBalance;
    	
    }
    public double calcSavingWithdraw(double amount) {
    	savingBalance=(savingBalance-amount);
    	return savingBalance;
    	
    }
    public double calcCheckingDeposit(double amount) {
    	checkingBalance=(checkingBalance+amount);
    	return checkingBalance;
    	
    }
    public double calcSavingDeposit(double amount) {
    	savingBalance=(savingBalance+amount);
    	return savingBalance;
    	
    }
    public void getCheckingWithdrawInput() {
    	System.out.println("Current Account Balance: "+moneyformat.format(checkingBalance));
    	System.out.println("Amount you want to withdraw from");
    	double amount=input.nextDouble();
    	if((checkingBalance-amount)>=0) {
    		calcCheckingWithdraw(amount);
    		System.out.println("New current AC balance : " +moneyformat.format(checkingBalance));
    		
    	}else {
    		System.out.println("Insufficient balance to make withdraw!");
    		
    	}
    }
    public void getsavingWithdrawInput() {
    	System.out.println("Saving Account Balance: "+moneyformat.format(savingBalance));
    	System.out.println("Amount you want to withdraw from");
    	double amount=input.nextDouble();
    	if((savingBalance-amount)>=0) {
    		calcSavingWithdraw(amount);
    		System.out.println("New saving AC balance : " +moneyformat.format(savingBalance));
    		
    	}else {
    		System.out.println("Insufficient balance to make withdraw!");
    		
    	}
    }
    public void getCheckingDepositInput() {
    	System.out.println("Current Account Balance: "+moneyformat.format(checkingBalance));
    	System.out.println("Amount you want to credit into account");
    	double amount=input.nextDouble();
    	if((checkingBalance+amount)>=0) {
    		calcCheckingDeposit(amount);
    		System.out.println("New current AC balance : " +moneyformat.format(checkingBalance));
    		
    	}else {
    		System.out.println("Insufficient balance to make withdraw!");
    		
    	}
    }
    public void getSavingDepositInput() {
    	System.out.println("Saving Account Balance: "+moneyformat.format(savingBalance));
    	System.out.println("Amount you want to credit into account");
    	double amount=input.nextDouble();
    	if((savingBalance+amount)>=0) {
    		calcSavingDeposit(amount);
    		System.out.println("New saving AC balance : " +moneyformat.format(savingBalance));
    		
    	}else {
    		System.out.println("Insufficient balance to make withdraw!");
    		
    	}
    }
    
    
}
