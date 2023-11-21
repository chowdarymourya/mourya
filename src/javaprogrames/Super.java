package javaprogrames;
class tree{
	String d="leafs";
	String f="fruits";
	void  wood() {
		System.out.println(d+f);
	}
}	
class toy extends tree{
	void human1() {
		//super.d="";
		//super.f="";
		super.wood();
	}
}	
	public class Super {

	public static void main(String[] args) {
		toy obj=new toy();
		obj.wood();
		tree obj1=new tree();
		obj1.wood();
	}
	}	
	


	
	
	
