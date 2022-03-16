package innerClasses;

public class InnerClassProg
{
	 public static void main(String[] args) 
	 { 
	        OuterClass x = new OuterClass(); 
	        x.outerSidemethod();   // calling uter class method
	 } 
}
class OuterClass
{ 
	private int age=90;
	
	void display()
	{
		System.out.println("inside display method"); 
	}
	
    void outerSidemethod() 
    { 
        System.out.println("inside outerSideMethod"); 
        
        // Inner class is local to outerMethod() 
        class Inner 
        { 
            void innersideMethod() 
            { 
            	display();
                System.out.println("inside innerSideMethod: " + age); 
            } 
        } 
        Inner y = new Inner();  //---> object creation of the local innerClass
        y.innersideMethod();   // calling inner class method
    } 
}