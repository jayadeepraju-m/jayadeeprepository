package assingment22;

public class Functionoverloading {
	int cal(int a, int b) 
	{
		return a+b;
	}
	float cal(int r) {
	return 3.14f*r*r;
	}
	int cal(int l, long bre) {
		return (int) (l*bre);
		
	}

	public static void main(String[] args) {
		Functionoverloading ob = new Functionoverloading();
		int j1 = ob.cal(16,17);
		float j2 = ob.cal(8);
		int j3 = ob.cal(6,8);
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
		
		

	}

}