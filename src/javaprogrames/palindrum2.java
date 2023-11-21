package javaprogrames;
import java.util.Scanner;
public class palindrum2 {
public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("enter string:");
		String n=d.nextLine();//eye
		String rev="";
		int len=n.length();//3
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+n.charAt(i);//eye
			}
		System.out.println(rev);
		
	if(n.equals(rev))
	{
		System.out.println("palindarum");
	}
	else {
		System.out.println("not palindarum");
	}
	
}	
}		

	


