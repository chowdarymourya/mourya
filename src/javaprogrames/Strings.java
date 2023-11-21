package javaprogrames;
import java. util.Scanner;
public class Strings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter star");
		
		int i =sc.nextInt();
		System.out.print("*");
		System.out.println();
		
	    int j=sc.nextInt();
	   // System.out.println();
		
		for(i=1;i<10;i++)
		{
			
		for(j=1;j<=i;j++)
		{
		  System.out.print("*");
		}
		System.out.println();
		
	}
	}
}

	



