package Number_loop;

public class Aemstrong {
	public static void main(String[] args) {
		int num = 153;
		int sum =0;
		int a=num;
		   while(num>0)
		   {
				int temp=num%10;
				sum=sum+(temp*temp*temp);
				num=num/10;
			}

		if(sum==a)
		{
			System.out.println(sum+"=" +"is an Armstrong number" );
		}
		else
		{
			 System.out.println(sum+"="+"is not an Armstrong number");
		}
	}

}
