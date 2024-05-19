	package Number_loop;

public class Palindrome {
public static void main(String[] args) {
	int number= 242;
	int a=number;
	int sum =0;
	
	for(int i=1;i<=3;i++)
	{
		int temp = number%10;
		sum=(sum*10)+temp;
	      number=number/10;
	}
	if(sum==a)
	{
	  System.out.println("Give number is Palindrome");
     }
	else
	{
		System.out.println("Give number is not palindeome");
	}
}
}