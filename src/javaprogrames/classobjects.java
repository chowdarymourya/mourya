package javaprogrames;
//method can not take parameters

public class classobjects {
	int bankempid=22;
	int salary=10000;
	String name="rolex";
	String depname="manager";
	void display() {
		System.out.println(bankempid);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(depname);
	}	
		public static void main(String[] args) {
			classobjects m=new classobjects();//here object calls var and 
			//methods
			m.bankempid=22;
			m.salary=10000;
			m.depname="manager";
			m.name="rolex";
			m.display();
			classobjects m2=new classobjects();
			m.bankempid=23;
			m.salary=20000;
			m.depname="manager";
			m.name="hukam";
			m.display();
			
		

	}

}
