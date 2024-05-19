package Condition;

public class Nested_codition {
public static void main(String[] args) {
	int a = 20;
	if (a%2==0)
	{
		if(a%5==0)
		{
			System.out.println("givan number is divible by 2 and 5");
		}
		else
		{
			System.out.println("givan number is divisible 2 but not by 5");
		}
	}
	else
	{
	 System.out.println("givan number number is not divisible by 2");
	}
}
}
