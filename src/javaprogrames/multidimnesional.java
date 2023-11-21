package javaprogrames;

public class multidimnesional {

	public static void main(String[] args) {
		int a[][]=new int [3][2];//rows and columns
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		for(int i=0;i<=2;i++)//rows//1
		{
			for(int j=0;j<=1;j++)//coloumns//0 1
			{
				System.out.print(a[i][j]+" ");//10,20 ,30,40,50,60
			}
			System.out.println();
		}
		
}
}
		

	


