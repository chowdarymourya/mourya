package javaprogrames;

public class removespace {

	public static void main(String[] args) {
		String n="The birds are  flying   in   the     sky";
		String m="";//here remove with out space
		 
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)!=' ') {
				m=m+n.charAt(i);//t
				
			}
			else {
				if(i+1<n.length()&& n.charAt(i+1)!=' ') {
					m =m+n.charAt(i);
				}
			}
		}
		System.out.println(m);

	}

}


	


