package Number_loop;

public class Perfect {
	public static void main(String[] args) {
		int number = 6;
		int sum=0;
		for(int i =1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==number)
		{
			System.out.println(sum+"is a Parfect number");
		}
		else {
			System.out.println("is Not a Perfect number");
		}
	}
}