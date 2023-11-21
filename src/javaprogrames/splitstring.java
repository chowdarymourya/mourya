package javaprogrames;
//welcome to java programming
// first split words number of parts
// each split reverse 
//and finally add string

public class splitstring {

	public static void main(String[] args) {
		String d=" hello every one";
		String[]sp=d.split(" ");//here split mutiple parts where space occured
		String rev="";//origanll
		for(String w:sp)//hello ,every ,one
		{
		String 	reverse =" ";
		
		for(int i=w.length()-1;i>=0;i--)
		{
			reverse=reverse+w.charAt(i);//hello//olleh
		}
		rev=rev+reverse+" ";
		}
		System.out.println(rev);
	}

}

