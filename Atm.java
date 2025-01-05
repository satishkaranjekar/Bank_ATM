package oops;

public class Atm {

	private String userName;
	private String bankName;
	private String branch;
	private String ifsc;
	private long accno;
	private int pin;
	private double balance;
	
	Atm()
	{
		
	}
	
	public Atm(String userName, String bankName, String branch, String ifsc, long accno, int pin, double balance)
	{
		this.userName=userName;
		this.bankName=bankName;
		this.branch=branch;
		this.ifsc=ifsc;
		this.accno=accno;
		this.pin=pin;
		this.balance=balance;
				
	}
	public String getUserName(long accno, int pin)
	{
		if(this.accno==accno && this.pin==pin)
		{
			return userName;
		}
		else
		{
			System.out.println("Invalid Credentials..!");
			return null;
		}
		
	}
	public String getBankName()
	{
		return bankName;
	}
	public String getBranch()
	{
		return branch;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public long getAccNo()
	{
		return accno;
	}
	
	public void setPin(long accno,int oldPin, int newPin)
	{
		if(this.accno==accno && pin==oldPin)
		{
			pin=newPin;
			System.out.println("Pin Updated Successfully...!");
		}
		else
		{
			System.out.println("Invalid Credentials...!");
		}
	}
	
	public double getBalance(long accno, int pin)
	{
		if(this.accno==accno && this.pin==pin)
		{
			System.out.println("Your Account Balance is:");
			return balance;
		}
		else
		{
			System.out.println("Invalid Credentials...!");
			return 0.0;		
		}
	}
	
public void withdraw(long accno, int pin, double amt)
{
if(this.accno==accno && this.pin==pin)	
{
	if(balance-amt >2000)
	{
		balance=balance-amt;
		System.out.println("Your Account Balance is: "+balance);
		
	}
	else
	{
		System.out.println("Insufficient Balance...!");
	}
}
else
{
	System.out.println("Invalid Credentials...!");
}
}
public void deposit(long accno, int pin, double amt)
{
	if(this.accno==accno && this.pin==pin)	
	{
		if(amt>0)
		{
			balance+=amt;
			System.out.println("Your Account Balance is: "+balance);
		}
		else
		{
			System.out.println("Incorrect Amount..!");
		}
	}
	else
	{
		System.out.println("Invalid Credentials...!");
	}
}
}
