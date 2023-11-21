package javaprogrames;

public class Demo7 {

	public static void main(String[] args) {
		double cost=33.5;//item cost
		double discount=10.5;
		if (cost==44)
		{
			System.out.println("discount=0.5");
		}
		else if(cost>21)
		{
			System.out.println("discount=0.3");
				
		}
		else if(cost<55)
		{
			System.out.println("discount=0.5");
		}
		else {
			System.out.println("no discount");
		}

	}

}

