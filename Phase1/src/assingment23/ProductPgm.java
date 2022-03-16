package assingment23;

class Product {
	int id=78;
	String name="Amul";
	void display() {
		System.out.println(id+" "+name);
	}
	
}

class A extends Product{
	int count=50;
	String catagory="butter";
	void display() {
		System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
	}
}


 class SubA extends A{
	int price=30;
	void totalprice() {
		int tp;
		tp=count*price;
		
		System.out.println(id+" "+name+" "+ catagory+" total price: "+tp);
	}

}

class B extends Product{
	int count=90;
	String catagory="Milk";
	void display() {
		System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
	}
}

class SubB extends B{
	int price=10;
	void totalprice() {
		int tp;
		tp=count*price;
		
		System.out.println(id+" "+name+" "+ catagory+" total price: "+tp);
	}
}

class C extends Product{
	int count=56;
	String catagory="choco";
	void display() {
		System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
	}

}


public class ProductPgm {

	public static void main(String[] args) {
		Product p=new Product();
		p.display();
		A a=new A();
		a.display();
		SubA SA = new SubA();
		SA.totalprice();
		B b=new B();
		b.display();
		SubB SB = new SubB();
		SB.totalprice();
		C c=new C();
		c.display();
		

	}

}
