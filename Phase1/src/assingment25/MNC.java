package assingment25;

public abstract class MNC 
{
	abstract void m1();
	abstract void m2();
	abstract void m4();
	abstract void m5();
	void m3()
	{
		System.out.println("in method m3 in MNC class");
	}
	
	public static void main(String[] args)
	{
		MNC x1=new Hello();
		Infosys x2=new Hello();
		x2.m1();
		x2.m2();
		x2.m3();
		x2.m4();
		x2.m5();
		x1.m1();
		x1.m2();
		x1.m3();
		x1.m4();
		x1.m5();
			}
}
abstract class Infosys extends MNC
{
	void m5()
	{
		System.out.println("in method m5 of infosys class");
	}
}

class Hello extends Infosys
{
	void m4()
	{
		System.out.println("in method m4 of Hello class");
	}
	void m1()
	{
		System.out.println("in method m1 of Hello class");
	}
	void m2()
	{
		System.out.println("in method m2 of the Hello class");
	}
}