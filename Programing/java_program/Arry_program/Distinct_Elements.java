package Arry_program;

public class Distinct_Elements {
	public static void main(String[] args) {
		int []a= {21,12,23,15,11,16};
		int [] b={53,26,23,15,18,12};
	
		for(int i=0;i<a.length;i++)
	  {
    	int find=0;
	  for(int j=0;j<b.length;j++)
	  {
		if(a[i]==b[j])
		{
			find=1;
		}
	   }
		if(find==0) 
		{
			System.out.println(a[i]);
	      }
	}
		for(int i=0;i<b.length;i++)
		{
			int find=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					find=1;
				}
			}
			if(find==0) 
			{
				System.out.println(b[i]);
			}
		}
	}
	
	
	}


