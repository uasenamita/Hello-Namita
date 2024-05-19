package Number_loop;

public class Strong_Range {
	  public int fact (int n)
	  {
		int fact =1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	  }
	  
	public static void main(String[] args) {
	Strong_Range or = new Strong_Range(); 
			
		int n = 200;
		for(int i=1;i<=n;i++)
		{
			int num = i;
		    int temp=num;
	    	int sum =0;
         while(num!=0)	
	     {  
	        int rem = num%10;
			 sum=sum+or.fact(rem);
			 num=num/10;
		    }
			 if(sum==temp)
			 {
				 System.out.println(sum+"="+"is a Strong number");
			 }
		}
}
}