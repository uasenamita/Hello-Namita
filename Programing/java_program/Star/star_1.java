package Star;

public class star_1 {
	public static void main(String[] args) {
		int num = 11;
		for (int i=0;i<=6;i++)
		{ 
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print(" "+i);
			}
			
			num=num-2;
			System.out.println();
		}
	}

}
