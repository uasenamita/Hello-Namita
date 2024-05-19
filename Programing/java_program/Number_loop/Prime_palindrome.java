package Number_loop;

public class Prime_palindrome {
	public static void main(String[] args) {
		int number = 515;
		int t = number;
		int j;
		int sum =0;
		
		for(int i=1;i<=number;i++)
		{
			int temp = number%10;
			sum=(sum*10)+temp;
		      number=number/10;
		}
		if(sum==t)
		{
			for(j=2;j<=sum;j++)
			{
				if(sum%j==0)
				{
					System.out.println("Prime palindrom");
 				break;
				}
			}	
			if(sum==j)
         
				System.out.println(t +"is a prime number");
		}
		else
		
			System.out.println(t+"is not a prime palindro");
		}
	}


