package assingment24;

import java.util.Scanner;
public class GradeRevision {
	String name;
    int bas;
    int expn;
    double inc;
    double nbas;
    
    GradeRevision() {
        name = "";
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }
    
     void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter basic: ");
        bas = in.nextInt();
        System.out.print("Enter experience: ");
        expn = in.nextInt();
    }