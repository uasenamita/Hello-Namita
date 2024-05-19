package Star;

public class Star_3 {
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
	}}
}


