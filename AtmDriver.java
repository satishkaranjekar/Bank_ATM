package oops;
import java.util.Scanner;
public class AtmDriver {
	static
	{
		System.out.println("Welcome to SBI Atm..!");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1. English");
	System.out.println("2. Hindi");
	System.out.println("3. Marathi");
	System.out.println("Select your option: ");
	int op=sc.nextInt();
	Atm a1=new Atm("Satish", "SBI", "Jawala", "SBIN0001232", 9876543210l, 1513, 10000);
	System.out.println(a1.getBalance(9876543210l, 1513));
	
	a1.deposit(9876543210l, 1513, 5000);
	a1.withdraw(9876543210l, 1513, 2500 );
	a1.setPin(9876543210l, 1513, 1212);
	System.out.println(a1.getBalance(9876543210l, 1212));
	System.out.println(a1.getUserName(9876543210l, 1212));
}
}
