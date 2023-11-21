package javaprogrames;

public class rev2 {

	public static void main(String[] args) {
		String s="good moring every one";
		String rev="";
		int a=s.length();
		for(int i=a-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string:"+rev);
	}

}
