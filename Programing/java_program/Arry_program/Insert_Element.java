package Arry_program;

public class Insert_Element {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int b= 4;
        int c = 6;
        
        for(int i =a.length-1;i>=b;i--)
        {
        	a[i] = a[i-1];
        }
           a[b-1]=c;
        for(int i =0;i<a.length;i++)
        {
        	System.out.print(a[i]);
        }
}
}