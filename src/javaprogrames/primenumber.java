package javaprogrames;
//
// 


public class primenumber {

	public static void main(String[] args) {
		int a=3;
		int factor=0;//2
		if(a>1)
		{
			for(int b=1;b<=a;b++)
			{
				if(a%b==0) {
				
					factor++;//1,2
				}
					
				}
					if(factor==0)
					{
						System.out.println(" prime number");
					}
					else {
						System.out.println("not prime number");
					}
					
				
			}
		
		else {
			System.out.println("not prime number");			
		}
		
	}
}


	


