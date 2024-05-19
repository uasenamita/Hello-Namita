package Star;

public class Roll_pettan {
	public static void main(String[] args) {
		for(int a=0;a<3;a++)
		{
			for(int b= 3;b>a;b--)
			{
				System.out.print(" ");
			}
			for(int c=0;c<=a;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(" ");
				}
	          for(int k=i;k<=3;k++)
	          {
	        	  System.out.print("* ");
	          }
	          System.out.println();
			}
	}
	}


