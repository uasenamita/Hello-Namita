package Arry_program;

public class Deleting_elements {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5};
	int del= 4;
	  for(int i=0;i<a.length-1;i++)
	  {  
		  if(a[i]==del)   
		  {
			  for(int j=0;j<del;j++)
			  {
				  a[j]=a[j+1];
			  }
		    }
		  System.out.print(a[i]);
	  }
}

}
