package javaprogrames;

public class duplicatearray {

	public static void main(String[] args) {
		String s[]= {"mourya","banu","madhu","rani","mourya"};
		int c[]= {100,200,300,400,100};
		for(int a=0;a<c.length;a++)//this loop will be repate string
		{
			for(int b=a+1;b<c.length;b++)//this loop will be compare string
				//duplicste with loop
			{
				if(c[a]==c[b])//here comparing two numbers
				{
					System.out.println("duplicates:"+c[a]);//100
				}
				
			}
		}

	}

}
