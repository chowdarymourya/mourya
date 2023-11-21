package javaprogrames;
//import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		// Scanner n=new Scanner(System.in);
		      //System.out.println("enter number:");
		      //int d=n.nextInt();
		int d=1234;
		    
		 //buffer class have using  reverse method with out any logic reverse string
		      StringBuffer rev;
		   StringBuffer m=new StringBuffer(String.valueOf(d));//here string.value mens
	//	  method  converting integer vale to string
		    rev=m.reverse();
		    System.out.println("reverse numner:"+rev);
		    
		   
		
	}

}
