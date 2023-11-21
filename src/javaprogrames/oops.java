package javaprogrames;
class W{//parent
	int a;
	char d;
 void add() {
	 System.out.println(a+d);
 }
}
class x  {//child
	int g;
	String f="";
	char d;
	void sum() {
		System.out.println(g+f+d);//
	}
}
class Y {
	char x;
	int i;
	void elements() {
		System.out.println(x);
		System.out.println(i);
	}
	public static int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

		
	}
}
public class oops {//head class

	public static void main(String[] args) {
		W obj=new W();
		obj.a=20;
		obj.d='S';
		obj.add();
		x obj1=new x();
		obj1.g=20;
		obj1.d='S';
		obj1.sum();
		Y obj2=new Y();
		obj2.x='S';
		obj2.i=20;
		obj2.elements();
		Z obj3=new Z();
		obj3.k=20;
		obj3.m='S';
		obj3.set();
		
		
		

	}

}
