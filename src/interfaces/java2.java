package interfaces;
interface  m{//interface class
int a=30;
int b=50;
void add();//here just write the method does not implement
}

public class java2 implements m{

 public void add() {//here implement method 
	 System.out.println(a+b);
	 
}

	public static void main(String[] args) {
		java2 n=new java2();
		n.add();

	}
}

	
	


