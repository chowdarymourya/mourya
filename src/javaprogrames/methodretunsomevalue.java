package javaprogrames;
public class methodretunsomevalue {
	
	  int a;
	 int b;
	int sum() {
		return (a+b);//22+33
	}	
	
	public static void main(String[] args) {
		methodretunsomevalue  obj =new methodretunsomevalue();
		obj.a=122;
		obj.b=133;
		int d =obj.sum();
		System.out.println(d);
		
		
		

	}

}
