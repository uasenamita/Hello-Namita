package Arry_program;

public class delete_element_1 {
	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5};
		StringBuilder output = new StringBuilder();
		
		for(int i = 0;i<ar.length;i++)
		{
			if(i!=2)
			{
				output.append(ar[i]);
			}
		}
		System.out.println(output);
	}

}
