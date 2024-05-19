package Arry_program;

public class Serach_an_element {
	public static void main(String[] args) {
		
		int[] ar = {22,11,23,11,15,19};
		int tar = 11;
		for(int i =0;i<ar.length;i++)
		{
			if(ar[i]==tar)
			{
				System.out.println(i);
			}
		}
	}

}
