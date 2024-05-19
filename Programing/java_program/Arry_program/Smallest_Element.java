package Arry_program;

public class Smallest_Element {
public static void main(String[] args) {
	int [] ar = {11,3,66,57,67,90};
	int min =ar[0];
	for(int i = 0;i<ar.length-1;i++)
		if(min>ar[i])
		{
			min =ar[i];
		}
	System.out.println(min);
}
}
