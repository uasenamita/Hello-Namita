package Arry_program;

public class Coommon_Elements {
	public static void main(String[] args) {
		 int [] a = {12,13,23,15,11,16};
		 int [] b = {53,18,23,10,15,13};
		 
		 for(int i = 0;i<a.length-1;i++)
		 {
			 for(int j=0;j<b.length-1;j++)
			 {
				 if(a[i]==b[j])
				 {
					 System.out.println(a[i]);
				 }
			 }
		 }
	}

}
