package Star;

public class Equileral {
public static void main(String[] args) {
	int  n =6;
	for(int i=0;i<=6;i++)
	{
		for(int j=6;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print("  "+i);
		}
		n=n+2;
		System.out.println();
	}
}
}
