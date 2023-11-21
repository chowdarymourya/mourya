package javaprogrames;

public class Static {
 static int a;
 static int z;
  int b;
  int c;
 static void dispaly() {
	 System.out.println(a);
 }
 void show() {
	 System.out.println(b+a);
 }
 void equality() {
	System.out.println(a+z);
	
	
}
 void possible() {
	 System.out.println(a+c);
 }
	
public static void main(String[] args) {
		a=22;
		dispaly();
		 Static j=new  Static();
		 j.b=40;
		 j.show();
		 Static j1=new  Static();
		 j1.a=77;
		 j1.z=99;
		 j1.equality();
		 Static k=new  Static();
		 k.a=98;
		 k.c=100;
		 k.possible();
		
	}


}
