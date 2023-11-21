package interfaces;
interface wood{//parent
	int s=33;
	String d="apple";
	void leafs();
	}
interface table{//parent
	int e=44;
	String f="grapes";
	void flowers();
}	
	public class java6 implements table,wood {//child
	public void leafs() {
		System.out.println(s+d);
			
		}
	public void flowers() {
		System.out.println(e+f);
	}
public static void main(String[] args) {
	java6 obj=new java6();
	obj.flowers();
	obj.leafs();
	}

}
