package String_Arry;

public class palindrome { 
	public static void main(String[] args) {
	
	String name = "malayalam";
	char[]At = name.toCharArray();
	String name1 =" ";
	for(int j = name.length()-1;j>=0;j--)
	{
		name1=name1 + At[j];
	}
	if(name.equalsIgnoreCase(name1))
	{
		System.out.println("Given word is palindrome");
	}
	else
	{
		System.out.println("Given word is palindrome");
	}
	}
}
