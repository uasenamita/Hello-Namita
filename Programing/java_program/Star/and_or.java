package Star;

public class and_or {
public static void main(String[] args) {
    for	(int a=1;a<=4;a++)
	{
		for(int b=1;b<=4;b++)
		{
			if((a==1)||(a==4))
			{
				System.out.print("*");
			}
			else
				System.out.print("0");
		}
		System.out.println();
	}
}
}
