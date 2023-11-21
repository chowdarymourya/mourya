package javaprogrames;

public class pal {

	public static void main(String[] args) {
	String d="mourya";
	String rev="";
	int len=d.length();
	for(int i=d.length();i<0;i--) {
		rev=rev+d.charAt(i);//ayruom
	}	
	System.out.println(rev);//ayruom	
	if(d.equals(rev))
	{
		System.out.println("palindrum:"+" "+d);	
	}
	else {
		System.out.println("not palindrum:"+" "+d);
	}
	}

}
