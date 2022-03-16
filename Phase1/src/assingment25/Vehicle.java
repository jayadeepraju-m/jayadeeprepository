package assingment25;

public abstract class Vehicle {

	
	int speed=20;
	long distance=400L;
	abstract void run();
	abstract void stop();
	public void fuel(int a)
	{
	}
	public void fuel(float b, String c)
	{
	}
	public void fuel(char d,int e) 
	{
		
	}
	Vehicle()
	{
		
	}
	
	 Vehicle(int i,long d)
	 {  
		    speed=i;
		    distance=d;
	 }  

	 public static void main(String[] args) 
	 {
		 Vehicle v1=new TwoWheeler();
		 Vehicle v2=new ThreeWheeler();
		 Vehicle v3=new FourWheeler();
		 Vehicle v4=new EightWheeler();
		 v1.run();
		 v1.stop();
		 v2.run();
		 v2.stop();
		 v3.run();
		 v3.stop();
		 v4.run();
		 v4.stop();
	 }
}
class TwoWheeler extends Vehicle
{
	 int speed=10;
	 long distance=120L;
	 int no_of_tyre=2;
	 public TwoWheeler()
	 {
		 
	 }
	@Override
	void run()
	{
		System.out.println("Two wheeler run");
	}
   @Override
	void stop()
   {
	   System.out.println("Two wheeler stop");
	   display();
	}
   void display()
   {
	   System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
   }
}
class ThreeWheeler extends Vehicle
{
		 int speed=50;
		 long distance=100L;
		 int no_of_tyre=3;
		void run()
		{
			System.out.println("Three wheeler runs");
		}
		void stop()
		{
			System.out.println("Three wheeler stops");
			display();
		}
		void display()
		{
			System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
		}
		
}
class FourWheeler extends Vehicle
{
		 int speed=30;
		 long distance=250L;
		 int no_of_tyre=4;
		 
		void run()
		{
			System.out.println("Four wheeler runs");
		}
		void stop()
		{
			System.out.println("Four wheeler stops");
			display();
		}
		void display()
		{
			System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
		}
		
}
class EightWheeler extends Vehicle
{
		 int speed=100;
		 long distance=300L;
		 int no_of_tyre=8;
		void run()
		{
			System.out.println("Eight wheeler runs");
		}
		void stop()
		{
			System.out.println("Eight wheeler stops");
			display();
		}
		 void display()
		{
			System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
		}
	 
}