package javaprogrames;
class bus{
	//int a=50;
	int charges() {
		return 50;
	}
	//System.out.print("bus charges:"+" "a);
}
class express extends bus {
	int charges() {
		return 100;
	}
}
class  superluxry extends bus {
	int charges() {
		return 200;
		
		
	}
}

public class Overriding {

	public static void main(String[] args) {
		bus obj=new bus ();
		obj.charges();
	System.out.println(obj.charges());
	express obj1=new express();
	obj1.charges();
	System.out.println(obj1.charges());
	superluxry obj2=new superluxry();
	obj2.charges();
	System.out.println(obj2.charges());

	}

}

