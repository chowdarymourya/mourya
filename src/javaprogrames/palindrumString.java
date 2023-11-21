package javaprogrames;
import java.util.Scanner;

public class palindrumString {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("enter string:");
	String a=m.nextLine();//mourya,ayirpus
	String rev= "";//dad,eye,madam,mom, mourya
	int len=a.length();//5
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);//eye
		}
	System.out.println("reverse string:"+" "+rev);//ayirpus
	if(a.equals(rev))
			{
		   System.out.println(a +"palindrum");
		
			}
	else {
		System.out.println(a+"not palindrum");
	}
			}

}
