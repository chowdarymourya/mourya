package javaprogrames;
class kurnool{
	String s;
	int pin;
void mandal() {
	
	System.out.println(pin+s);
}
	}
class kadapa extends kurnool{
	String f;
	int pin;
	void mandal() {
		
		System.out.println(pin+f);
	}
	
}
public class overriding2 {

	public static void main(String[] args) {
		kurnool obj=new kurnool();
		obj.pin=100;
		obj.s="srisailam";
		obj.mandal();
		kadapa obj1=new kadapa();
		obj1.f="pulivendula";
		obj1.pin=200;
		obj1.mandal();
		
		

	}

}
