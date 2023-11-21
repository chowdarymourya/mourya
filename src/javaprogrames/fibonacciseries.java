package javaprogrames;
//here use for loop for fibonacci genrating t0 10 numbers
//012345678910
//0+1=1//out put
//1+1=2//n1,n2,sum
//2+1=3
//3+2=5
//5+3=8
//8+5=13
//13+8=21
//21+13=34
//34+21=55
//55+34=89



public class fibonacciseries {

	public static void main(String[] args) {
		int a=0;
		int a1=	1;
	int sum =0;
	System.out.println(a+a1);//0,1
	for(int i=2;i<10;i++)
	{
		sum=a+a1;//1
		System.out.println("  "+sum);//1
		a=a1;
		a1=sum;
	}
	

		
	}

} 
