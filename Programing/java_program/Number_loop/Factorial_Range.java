package Number_loop;

public class Factorial_Range {

	public static void main(String[] args) {
		for(int i = 1;i<=6;i++)
		{       
			int fact= 1;
			for(int j =i;j>=1;j--)
			{
				fact=fact*j;
			}
		  System.out.println(fact);
		}
	}
	
}
