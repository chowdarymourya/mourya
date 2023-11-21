package javaprogrames;

public class Splitstring2 {

	public static void main(String[] args) {
		String s="hello every one";//
		String[]b=s.split(" ");//here splits multiple parts
		String rev="";//string reverse
		
for(String q:b)//hello every one//advance for loop
{
	String reverse="";//string words
	for(int i=q.length()-1;i>=0;i--)
	{
		reverse=reverse+q.charAt(i);// extract,olleh,yreve,eno  
	}
	rev=rev+reverse+" ";//origanll revesre olleh,yreve,eno
	
}
System.out.println(rev);
	System.out.println("exitd");	
	}

}
