package javaprogrames;
import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int a=sc.nextInt();
		System.out.println("first number ");		
		int b=sc.nextInt();
		System.out.println("second number");
		int c=sc.nextInt();
		System.out.println("third number");
		
		if((a<b)&&(a>c))
		{
			System.out.println("a is lagrest number ");
		}
		else if((b<c)&&(b>a))
		{
			System.out.println("b is largest number");
		}
		
		
		else {
			System.out.println("c is largest number");
		}
				
			
		
				
	}

}
