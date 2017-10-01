import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDetails 
{
	String Name;
	String Email_id;
	long roll_number;
	String address;
	String phone_number;
	double hsc;
	double ug;
	
	public StudentDetails() throws IOException
	{
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Roll No.:");
			roll_number=Long.parseLong(br.readLine());
			System.out.println("Name:");
			Name=br.readLine();
			while(true)
			{
				System.out.println("Enter phone number Number:");
				phone_number=br.readLine();
				if(phone_number.length()==10)
				{
					
					break ;
				}
				System.out.println("Invalid number");
			}
			while(true)
			{
				System.out.println(" Enter Email_id :");
				Email_id=br.readLine();
				if(Email_id.contains("@") && Email_id.endsWith(".com"))
				{
					break ;
				}
				System.out.println("Invalid id");
			}
			System.out.println("Address:");
			address=br.readLine();
			System.out.println("HSC Marks(%):");
			hsc=Double.parseDouble(br.readLine());
			System.out.println("UG Marks(%):");
			ug=Double.parseDouble(br.readLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Caught "+e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Caught "+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught "+e);
		}
	}
	void check()
	{
		if(hsc>=60 && ug>=70)
		{
			System.out.println("Eligible for National Institute addmission");
		}
		else
		{
			System.out.println("Not Eligible for National Institute addmission");
		}
	}
	public static void main(String args[])
	{
		try{
		StudentDetails obj=new StudentDetails();
		obj.check();
		}
		catch(IOException e)
		{
			System.out.println("Caught "+e);
		}
	}
}
