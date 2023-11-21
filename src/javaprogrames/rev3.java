package javaprogrames;
import java. util.Scanner;
//MOURYA..AYRUOM
public class rev3 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
   String f=sc.next();
   String re="";
   int len=f.length();
   for(int a=len-1;a>=0;a--)
   {
	   re=re+f.charAt(a);
   }
   System.out.println(re);
   
   
	}


}


