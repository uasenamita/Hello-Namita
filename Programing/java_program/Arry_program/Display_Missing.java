package Arry_program;

public class Display_Missing {
	public static void main(String[] args) {
		
		int ar[] = {8,15,21,24,30,37,102};
		for(int i=0;i<ar.length-1;i++)
		{     
			for(int j=ar[i]+1;j<ar[i+1];j++)
			{
				System.out.print(j+",");
			}
		}

}

}
