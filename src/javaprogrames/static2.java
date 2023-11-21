package javaprogrames;

public class static2 {
	static int a=30;
	static String b="ram";
	int f=33;
	static void ram() {
		System.out.println(a+b);
		}
	void sitha() {
		System.out.println(a+b);
	}
	 void madhu() {
		System.out.println(f+b);
	}
public static void main(String[] args) {
		ram();
		static2 obj=new static2();
		obj.sitha();
		static2 obj1=new static2();
		obj1.madhu();
	}

}
