package javaprogrames;

public class takeparameters {
	int a;
	int b;
	
	void sum(int c,int d) {//here just callthe paramers through the object
		//a=c;
		//b=d;
		System.out.println(a+b);		
	}
	

	public static void main(String[] args) {
		
		takeparameters obj= new takeparameters();
		obj.sum(10,20);

	}

}
