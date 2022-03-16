package assingment22;

public class Student
{
	String name;
	int age;
	char section;
	char gender;
	int sub1;
	int sub2;
	int sub3;
	int sum;
	long Totalsubmarks;
	double percentage;
	public Student(String name,char section,char gender,int sub1,int sub2,int sub3,long Totalsubmarks)
	{
		this.name=name;
		this.section=section;
		this.gender=gender;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.Totalsubmarks=Totalsubmarks;
	}
	
	
	public Student(String name,char section,char gender,int sub2,int sub3,long Totalsubmarks)
	{
		this.name=name;
		this.section=section;
		this.gender=gender;
		this.sub2=sub2;
		this.sub3=sub3;
		this.Totalsubmarks=Totalsubmarks;
		
	}
	
	public static void main(String[] args) 
	{
		Student s1=new Student("Saint",'A','M',91, 95, 88,300);
		Student s2=new Student("Avenger", 'B', 'M',  98, 85,300);
		Student s3=new Student("Warrior", 'C', 'M', 96, 81,300);
		Student s4=new Student("jai", 'C', 'M', 93, 86,87,300);
		
		System.out.println("stu1 name is :"+s1.name+"stu1 gender is :"+s1.gender+" "+"stu1 section is : "+s1.section);
		System.out.println("stu1 sub1 marks is :"+s1.sub1+" "+"stu1 sub2 marks is :"+s1.sub2+" "+"stu1 sub3 marks is :"+s1.sub3+"stu1 Totalsubmarks is:"+s1.Totalsubmarks);
		System.out.println("stu1 sum of obtained marks is:"+s1.sum(91,95,88));
		System.out.println("stu1 percentage is :"+s1.percentage(91,95,88));
		System.out.println("");
		System.out.println("stu2 name is :"+s2.name+"stu2 gender is :"+s2.gender+" "+"stu2 section is : "+s2.section);
		System.out.println("stu2 sub1 marks is :"+s2.sub1+" "+"stu2 sub2 marks is :"+s2.sub2+" "+"stu1 sub3 marks is :"+s2.sub3+"stu2 Totalsubmarks is:"+s2.Totalsubmarks);
		System.out.println("stu2 sum of obtained marks is:"+s2.sum(0,98,85));
		System.out.println("stu2 percentage is :"+s2.percentage(0,96,81));
		System.out.println("");
		System.out.println("stu3 name is :"+s3.name+"stu3 gender is :"+s3.gender+" "+"stu3 section is : "+s3.section);
		System.out.println("stu3 sub1 marks is :"+s3.sub1+" "+"stu3 sub2 marks is :"+s3.sub2+" "+"stu1 sub3 marks is :"+s3.sub3+"stu3 Totalsubmarks is:"+s3.Totalsubmarks);
		System.out.println("stu3 sum of obtained marks is:"+s3.sum(0,76,21));
		System.out.println("stu3 percentage is :"+s3.percentage(0,76,21));
		System.out.println("");
		System.out.println("stu4 name is :"+s4.name+"stu1 gender is :"+s4.gender+" "+"stu1 section is : "+s4.section);
		System.out.println("stu4 sub1 marks is :"+s4.sub1+" "+"stu1 sub2 marks is :"+s4.sub2+" "+"stu1 sub3 marks is :"+s4.sub3+"stu4 Totalsubmarks is:"+s4.Totalsubmarks);
		System.out.println("stu4 sum of obtained marks is:"+s4.sum(93,86,87));
		System.out.println("stu4 percentage is :"+s4.percentage(93,86,87));
		
		
	}
	int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	double percentage(int x,int y,int z)
	{
		return (double)((x+y+z)*100/Totalsubmarks);
	}
}