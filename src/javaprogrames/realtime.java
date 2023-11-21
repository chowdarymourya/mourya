package javaprogrames;
class human{
	
int elements()
{
	return 22;
	
	
	//System.out.println(age);
	
}

}
class raju extends human {
	
	int elemnts()
	{
		return 100;
		//System.out.println(s);
	}

	
}

public class realtime {

	public static void main(String[] args) {
		human obj=new human();
		System.out.println(	obj.elements());
	raju obj2=new raju();
	obj2.elements();
	System.out.println(obj.elements());
		
	
	}

}
