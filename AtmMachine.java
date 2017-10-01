import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

//import javax.swing.JOptionPane;

public class AtmMachine
{
	String Account_number;
	int Pin_number;
	int balance;
	int check=0;
	public Atm()
	{
		try
		{ 
			Scanner sc=new Scanner(System.in);
			System.out.print("\nEnter your account number:");
			Account_number=sc.nextLine();
			System.out.print("\nEnter your Pin_number number:");
			Pin_number=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.print("\nEnter the valid input");
		}
		catch(NumberFormatException e)
		{
			System.out.print("\nConversion is not valid");
		}
	}
	void deposit(int n)
	{
		this.balance+=n;
	}
	void Withdraw(int n)
	{
		this.balance-=n;
	}
	void display()
	{
		System.out.println("\nTotal Balance : "+this.balance);
	}
	public static void main(String args[])throws ClassNotFoundException
	{
		
		Map<String,Integer> mp=new HashMap<String,Integer>(); 
		mp.put("asdf", 9211);
		mp.put("psik", 8321);
		mp.put("jsds",9353);
		mp.put("ursf",1943);
		
		Scanner sc=new Scanner(System.in);
		Atm obj=new Atm();
		
		try{
			int am,amt;
			for(Map.Entry<String,Integer> entry : mp.entrySet())
			{
				if( obj.Account_number.equals(entry.getKey()) && obj.Pin_number==entry.getValue())
				{
					obj.check++;
					while(true)
					{
						System.out.println("\nEnter Your Choice: 1.Deposit 2.Withdraw 3.Show Balance 4.Exit");
						int n=sc.nextInt();
						switch(n)
						{
						case 1:
							System.out.print("\nAmount:");
							am=sc.nextInt();
							obj.deposit(am);
							break;
						case 2:
							System.out.print("\nAmount:");
							amt=sc.nextInt();
							obj.Withdraw(amt);
							break;
						case 3:
							obj.display();
							break;
						case 4:
							System.exit(1);
							break;
						}
					}
					
				}
			}
		}
		catch(NullPointerException e)
		{
			System.out.print("\nNo operation  performed with null string");
		}
		catch(InputMismatchException e)
		{
			System.out.print("\nEnter the valid input");
		}
		catch(NoSuchElementException e)
		{
			System.out.print("\nElement not found");
		}

		if(obj.check==0)
		{
			//JOptionPane.showMessageDialog(null, "INVALID Pin_number NUMBER", "Warning",JOptionPane.WARNING_MESSAGE);
			System.out.println("\nWRONG Pin_number NUMBER");
		}
	}
}
