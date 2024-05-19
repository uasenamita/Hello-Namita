
package Arry_program;

public class duplicate_element {
	
	public static void main(String[] args) {
		int[] ar= {1,1,5,5,4,3,2};
		int count=0;
		for(int i =0;i<ar.length;i++)
		{
 			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
