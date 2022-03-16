package projects;

import java.io.*;
public class FileHandling {
 public static void main(String[] args){
 //Writing in the file

 try
 {
FileWriter f = new FileWriter("C:\\Users\\91800\\Desktop\\RAJU\\DEEP");
 try
 {
 f.write("Harrypotter");
 }
 finally
 {
 f.close();
 }
 System.out.println("Successfully Written");
 }
 catch(IOException i)
 {
 System.out.println();
 }

//Reading an Existing file
try
{
FileReader r = new FileReader("C:\\Users\\91800\\Desktop\\RAJU\\DEEP");
try
{
int i;
while((i=r.read())!=-1)
{
System.out.print((char)i);
}
}
finally
{
r.close();
System.out.print("\n");
System.out.print("File Closed successfully");
}
}
catch(IOException e)
{
System.out.println();
}
System.out.println();
//Append text to Existing File.
String path = ("C:\\Users\\91800\\Desktop\\RAJU\\DEEP");
String text = (" PRADHAS");
try
{
FileWriter f = new FileWriter(path,true);
f.write(text);
f.close();
System.out.println("Append done Successfully");
}
catch(IOException e){
	 System.out.println();
	 } 
}
 }