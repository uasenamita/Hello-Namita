package Arry_program;

public class Palindrome {
	public int revdig(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Palindrome pa=new Palindrome();
		int []ar = {232,12,45,787,34543,90};
		int count =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==pa.revdig(ar[i]))
				count++;
		}
		System.out.println("Number of Palindrom: "+count);
	}

}
