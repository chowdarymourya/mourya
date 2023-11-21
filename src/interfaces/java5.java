package interfaces;
interface bus{//multiple  parent
	int e=100;
	String c="hyd";
	void charges();
}
interface express{//parent
	int a=200;
	String d="kurnool";
	void money();
	
}
public class java5 implements bus,express {//child
	public void charges() {
		System.out.print(e+c);//implements
		
	}
	public void money() {
		System.out.print(a+d);//implements
		
	}

public static void main(String[] args) {
	java5 obj=new java5();
	obj.charges();
	obj.money();

	}

}
