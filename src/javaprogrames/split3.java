package javaprogrames;
//how  are u
//split each split rverse ,store
//origanll rev store
public class split3 {

	public static void main(String[] args) {
		String d="how are u";
		String []e=d.split(" ");
		String rev=" ";//
		for(String o:e)//rotate 3 splits and stores
		{
		String reverse=" ";
	
		for(int s=o.length()-1;s>=0;s--)
		{ 
			reverse=reverse+o.charAt(s);//woh 
		}
		rev=rev+reverse+" ";//woh era u
		
		}
		System.out.println(rev);//woh era u
	}
}
	

