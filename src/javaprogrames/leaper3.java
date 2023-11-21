package javaprogrames;
import java.util.Scanner;

public class leaper3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("leaper");
		
		int	y=sc.nextInt();
		
	if ((y%400==0)||(y%4==0)&(y%100!=0))
	{
		System.out.println("leaper");
	}
	else {
		
	System.out.println("not leaper");

	}
	
}
}