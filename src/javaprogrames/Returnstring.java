package javaprogrames;

public class Returnstring {
	String s;
	String d;
String	sum(){ //here return type is string doing sum task put void cant not do anything
	return (s+d);
	
		
	}

	public static void main(String[] args) {
		Returnstring  m=new Returnstring();
		m.s="hello";
		m.d=" java";
		String a=m.sum();
		System.out.print(a);
		
	}

}
