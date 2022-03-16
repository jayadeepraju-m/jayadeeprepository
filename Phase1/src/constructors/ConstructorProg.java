package constructors;

public class ConstructorProg 
{
	int id;   
	String name;  
	long z1;
	String d1;
	
	
		
	public ConstructorProg() 
	{
		id=89;
		name = "hello";
		z1=44387564387L;
		d1="helloworld";
		
		System.out.println("inside the default constructor");
	}
	
	void display() 
	{
		System.out.println(id+" "+name);
		System.out.println("name is:"+name);
		System.out.println("long value is:"+z1);
		System.out.println("string2 is :"+d1);
	}  
	public static void main(String[] args) 
	{
		ConstructorProg c1=new ConstructorProg();
		c1.display();
		
	}

}