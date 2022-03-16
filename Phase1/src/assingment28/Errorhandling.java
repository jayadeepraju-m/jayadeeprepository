package assingment28;

import java.util.Scanner;
public class Errorhandling {
	Scanner sc=new Scanner(System.in);
	int salary=sc.nextInt();
	static void salaryCheck(int salary) throws InvalidSalary,InvalidateSalary,InvalidatedSalary
	{
		if(salary<2100)
		{
			throw new InvalidSalary("you need to work hard");
		}
		
		if(salary<2100 || salary>5000)
		{
			throw new InvalidateSalary("your salary is somehow god");
		}
		if(salary<5100 || salary>9000)
		{
			throw new InvalidatedSalary("salary is very good");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			salaryCheck(4819);
		}
		catch(Exception e)
		{
			System.out.println("Exception ocurred : "+e.getMessage());
		}
		
	}
}
class InvalidSalary extends Exception
{
	public InvalidSalary(String s) 
	{
		super(s);
	}
}
class InvalidateSalary extends Exception
{
	public InvalidateSalary(String s) 
	{
		super(s);
	}
}
class InvalidatedSalary extends Exception
{
	public InvalidatedSalary(String s) 
	{
		super(s);
	}
}