package javaprogrames;

public class Leapyear {

	public static void main(String[] args) {
		short y=2016;
		
		if((y%400==0)||(y%4==0)&(y%100!=0))
				{
			System.out.println("leaper");
			}
		else {
			System.out.println("not leaper");
		}
	}

}
