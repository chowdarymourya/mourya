package javaprogrames;
import java.util.Scanner;
//here count each word of string //mourya 6
public class countwrodinstring {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String d=sc.nextLine();//
		int count=0;
		int m=d.length();//9
		for(int i=0;i<m-1;i++)//good  moring to every one        
		{
		if((d.charAt(i)==' ')||(d.charAt(i+1)!=' '))//how are you
		{
			count++;
	}
		}
		System.out.println("count the string:"+count);

	}

}
