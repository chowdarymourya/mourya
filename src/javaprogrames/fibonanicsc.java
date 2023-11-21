package javaprogrames;
import java.util.Scanner;

public class fibonanicsc {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("fibo number");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		System.out.println(a+b);
		for(int i=2;i<10;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
					
			
		}

	}

}
