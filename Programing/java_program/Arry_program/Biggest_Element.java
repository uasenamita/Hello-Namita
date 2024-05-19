package Arry_program;

public class Biggest_Element {
	
	public static void main(String[] args) {
		int [] arr = {11,54,95,64,2,77};
		int max = arr[0];
		
		for(int i =0;i<arr.length;i++)
			if(max<arr[i])
			{
				max = arr[i];
			}
			System.out.println(max);
		}
	}


