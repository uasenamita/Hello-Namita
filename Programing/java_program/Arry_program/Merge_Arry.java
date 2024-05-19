package Arry_program;

public class Merge_Arry {
	public static void main(String[] args) {
		int []a = {1,2,3,4};
		int []b= {5,6,7,8};
		
		int []c=new int [a.length+b.length];
		
		for(int i = 0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		for(int i = 0;i<=b.length-1;i++)
		{
			c[i+b.length]=b[i];
		}
			for(int j =0;j<=c.length-1;j++)
			{
				c[j]=c[j];
				System.out.print(c[j]);
			}
	System.out.println();
	}

}
