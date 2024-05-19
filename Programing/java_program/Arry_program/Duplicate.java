package Arry_program;

public class Duplicate {
	public static void main(String[] args) {
		
	String [] s = {"a,b,s,f,a,h,b"};
	String [] as = s[0].split(",");
	find(as); }

	private static void find(String[] as) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<as.length;i++)
		{
			for(int j =i+1;j<as.length;j++)
			{
				if(as[i].equals(as[j]))
				{
					System.out.print(as[j]+" ");
				}
			}
		}
	}

	

 }
