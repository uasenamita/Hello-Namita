package Arry_program;

public class FirstBiggest_SecondBigg {
	public static void main(String[] args) {
		int ar[]= {28,12,14,56,2,13};
		int a =ar[0];
		int b =ar[1];
		
		for(int i=1;i<ar.length-1;i++)
		{
			if(a<ar[i])
			{
				b=a;
				a=ar[i];
			}
			else if(b<ar[i])
			{
				b=ar[i];
			}
		}
		System.out.println(a+"="+"First Bigg");
		System.out.println(b+"="+"Second Bigg");
	}

}
