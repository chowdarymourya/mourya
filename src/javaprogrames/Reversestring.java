package javaprogrames;
//marolix =string,find length 7,for loop and use concation + each letter,and extract each
//charcter
//reverse=xiloram;
//
public class Reversestring {
	public static void main(String[] args) {
		String m="dad";//1234567,//0123456
		String re="";
		
		int len=m.length();//here using length method//7
		for(int i=len-1;i>=0;i--)//
		{
			re=re+m.charAt(i);//here gaine the reverse order marolix//xiloram
			
		}
		System.out.println("reverse string:"+" "+re);//dad
		if(m.equals(re))//.equals..two strings equall are not
		{
			System.out.println(m+"palindrum");
			
			
		}
		else
		{
			System.out.println(m+"not palindrum");
		}

	}

}
