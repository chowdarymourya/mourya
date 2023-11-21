package javaprogrames;

public class reversename {

	public static void main(String[] args) {
		String n="mourya";
		String rev="";
		int len=n.length();//6
		for(int i=len;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}
		System.out.println("reverse string:"+rev);

	}

}
