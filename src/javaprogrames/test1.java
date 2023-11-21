package javaprogrames;

class a{
	int d;
	int c;
	 void display()
	{
		System.out.println(d);
	}
}
	class b extends a{
		int e;
		int f;
		 void show()
		{
			System.out.println(e);
		}
	}
	class c extends b{
		int g;
		int h;
		void propertys()
		{
			
		}
	}
		
	public class test1 {

	public static void main(String[] args) {
		a obj =new a();
		obj.c=20;
		obj.d=30;
		b bobj=new b();
		bobj.e=20;
		bobj.f=30;
		bobj.show();

	}
	}
	



