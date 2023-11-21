package javaprogrames;

public class polymorpism {
	int a=33;
	static int b=60;
	void sam()
	{
		System.out.println(a+b);
	}
	void sam(int a,int b) {
		System.out.println(b);
	}
	void sam(char s,String d) {
		System.out.println(s+ "  "+d);
	}
	

	public static void main(String[] args) {
		
		 polymorpism obj=new  polymorpism();
		 obj.sam();
		 obj.sam(22, 33);
		 obj.sam('A',"mourya");
		 
		 
	}
	

}
