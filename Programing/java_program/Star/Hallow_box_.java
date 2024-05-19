package Star;

public class Hallow_box_ {
public static void main(String[] args) {
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if((i==1)||(i==4))
			{
				if((j==1)||(j==4))
			   {
				System.out.print("*");
			     }
				else {
					System.out.print("0");
				   }
			}
		   else if (((i==2)||(i==3))&&((j==1)||(j==4)))
		   {
		 	System.out.print("0");
		}
		else
		{
			System.out.print(" ");
		}
			
	}
		System.out.println();

	}
}
}
