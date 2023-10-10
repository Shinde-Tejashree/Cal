 import java.util.Scanner;
 import java.io.*;
 

 public class Calci

{  public static void main(String [] args)
	{
		int a,b,c,d, first,second;
                Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number::");
		
		first=sc.nextInt();
		second=sc.nextInt();
		

		a=first + second ; // addition of two number
		b=first -second;   // substration of two number
		c= first * second; // mulltiplication of two number
 		d= first /second;  // Division of two number
}
	

}

