package Number_loop;

public class Strong_or_not {
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
		Strong_or_not or = new Strong_or_not(); 
		
		int n = 145;
		int num = n;
		int temp=num;
		int sum =0;
      while(num!=0)	
        {
        	int rem = num%10;
			num=num/10;
			 sum=sum+or.fact(rem);
		}
		 if(sum==temp)
		 {
			 System.out.println(sum+"="+"is a Strong number");
		 }
		 else
		 {
			 System.out.println(sum+" "+"is not a Strong Number");
		 }
	}
}
