package javaprogrames;

public class occurrencesofcharcter {

	public static void main(String[] args) {
		String m="java is object oriented programming";
		
		int t1=m.length();//here totall length of string
		int t2= m.replace("m","").length();
		char d='m';
		System.out.println(d);
		int count=t1-t2;
		System.out.println("count string:"+count);
		
	}

}
