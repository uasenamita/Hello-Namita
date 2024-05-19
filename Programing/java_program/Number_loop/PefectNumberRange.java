package Number_loop;

public class PefectNumberRange {
	public static void main(String[] args) {
		int n = 100;
		for(int i =1 ;i<=n;i++)
		{
			int sum =1;
         for(int j =2;j<=i/2;j++)
         {
			if(i%j==0)
				sum=sum+j;
			}
         if(sum==i)
         {
        	 System.out.println(i);
         }
		}
		
	}

}
