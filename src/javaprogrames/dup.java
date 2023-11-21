package javaprogrames;

public class dup {

	public static void main(String[] args) {
		String a[]= {"mourya","supriya","sunitha","supriya"};
		for(int i=0;i<a.length;i++)//each string extract and repated 
		{
			for(int j=i+1;j<a.length;j++)//just compare each name 
			{
				if(a[i]==a[j])//comapre conform
				{
					System.out.println("duplicate name:"+a[i]);
				}
			}
			
		}
        
	}

}
