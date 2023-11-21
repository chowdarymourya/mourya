package interfaces;
class tree{//hybrid//parent 
	String a="leafs";
	int b=4;
	void sweet() {
		System.out.println(a+b);
	}
}
interface  mangotree  {
	String m="mangoes";
	char f='S';
	int g=22;
	void properties();
	
}
interface  appletree{
	String s="apples";
	int a=4;
	void app(); 
}


  class demo implements mangotree,appletree{ 
	 public void properties() {
		  System.out.println(f+g);
		  System.out.println(m);
	  }
	 public void app() {
		 System.out.println(s+a);
	 }
		 
public class java1   {

	public static void main(String[] args) {
		demo obj=new demo();
		obj.properties();
		obj.app();
		

	}
}
  }
  


