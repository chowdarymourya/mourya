package javaprogrames;
import java.util.Scanner;

public class postivenegative {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);//synatx
		System.out.println("enter a number");
		int b=obj.nextInt();
		if(b>0)//postive vallue all ways greater then 0//3
		{
			System.out.println("psotive value");//3
			
		}
		else if (b<0)//-3<0
		{
			System.out.println(" negative value");
			
		}
		
		
		else
		{
			System.out.println("zero");
		}
			
		
		
	}

}
