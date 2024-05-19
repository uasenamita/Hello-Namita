package Number_loop;

public class Reeverse {
	public static void main(String[] args) {
		int number= 154;
		int sum =0;
		
		while(number>0)
		{
			int temp = number%10;
			sum=(sum*10)+temp;
		      number=number/10;

		}
		System.out.println(sum);
	}

}
