package javaprogrames;

public class Constructor {
	static int a;
	String s="";
	
	 void  con(int a,String s)
	{

System.out.println(a+s);
	}
	 void con1(float d,char w) {
		System.out.println(d+" "+s);
	}
		
public static void main(String[] args) {
		Constructor j=new Constructor();
		j.con(22, "mourya");
		j.con1(2.2f,'A');

	}
}
