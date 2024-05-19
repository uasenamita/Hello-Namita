package Star;

public class Star_4 {
	public static void main(String[] args) {
		int n = 0;
		for(int a=0;a<6;a++)
		{
			for(int b= 6;b>a;b--)
			{
				System.out.print("  ");
			}
			for(int c=0;c<=n;c++)
			{
				System.out.print(" "+a);
			}
			n=n+2;
			System.out.println();
		}
		int num = 11;
		for (int i=0;i<=6;i++)
		{ 
			for(int j=0;j<=i;j++)
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
