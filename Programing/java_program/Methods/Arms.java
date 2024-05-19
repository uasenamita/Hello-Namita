package Methods;

public class Arms {
      public int power(int p,int b)
     {      int prod =1;

    	 for(int i =1;i<=p;i++)
    	 {
    		 prod=prod*b;
    	 }
    	  return prod;
    	 }     	   
     public static void main(String[] args) {
    	 Arms pro = new  Arms(); 
    	 int a=123;
    	 int b=a;
    	 int p=2;
    	 int sum =0;
    	 while(a>0)
    	 {
    		 int temp = a%10;
    		 sum =sum+pro.power(p, temp);
    		 a = a/10;
    	 }System.out.println(sum);
    	 /*
		if(b==sum)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not strong number");
		}*/
	}
     }