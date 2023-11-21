package interfaces;
interface mourya{//multiple inheritance
String a="house";
String b="white ";
int c=5;
void properties();
}
interface banu{//2 parent
	String y="buliding";
	String x=" yellow";
	int w=6;
	void items();
}
public class java3 implements mourya,banu {
	public  void properties() {
		System.out.println("properties;"+a);
		System.out.println("properties;"+b);
		System.out.println("properties;"+c);
}
	public void items() {
		System.out.println("properties;"+y);
		System.out.println("properties;"+x);
		System.out.println("properties;"+w);
	}

	public static void main(String[] args) {
		java3 w=new java3();
		w.properties();
		w.items();
	}	
	
}
	

	


