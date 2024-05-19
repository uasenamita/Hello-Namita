package Arry_program;

public class Occurrence {
public static void main(String[] args) {
	int [] ar = {22,11,23,11,15,19,11};
	int in = 11;
	int first=-1,last=-1;
	for(int i =0;i<ar.length-1;i++)
	{
		if(in!=ar[i])
			continue;
		if(first==-1)
			first=1;
		last=1;
	}
	if(first!=1)
	{
		System.out.println(first);
		System.out.println(last);
	}
	else
	{
		System.out.println("not first");
	}
	
}
}
