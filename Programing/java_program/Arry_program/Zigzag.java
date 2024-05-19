package Arry_program;

public class Zigzag {
	public static void main(String[] args) {
		
	int []a = {1,2,3,4,5};
    int []b = {6,7,8,9,10};
     int []c=new int [a.length+b.length];
     int i=0;int j=0;
     for(int k =0;k<=a.length+1;)
     {
	   if(i<a.length)
	   {
		   c[k]=a[i];
		   i++;
		   k++;
	   }
	   if(j<b.length)
	   {
		   c[k]=b[j];
		   j++;
	       k++; 
	   }
    }
     for(int l=0;l<c.length;l++)
     {
    	 System.out.print(c[l]);
     }
	}


}
