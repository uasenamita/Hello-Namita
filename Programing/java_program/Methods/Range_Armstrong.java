package Methods;

public class Range_Armstrong {
	public int power (int p,int b)
	{  
		int prod=1;

	  for(int i =1;i<=p;i++)
	   {

		 prod=prod*b;
	  }
	    return prod;
	 } 		
	public static void main(String[] args) {
		Range_Armstrong ar = new Range_Armstrong();
		
		int num = 400;
		 int b=num;
    	 int p=3;
	      for (int i = 1;i<num; i++){
	         int check=i;
	         int  sum = 0;
	         
	         while(check != 0) 
	         {
	           int temp = check % 10;
	            sum = sum +ar.power(p, temp);
	            check = check / 10;
	         }
	}
	}

}
