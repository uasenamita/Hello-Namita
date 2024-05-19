package Number_loop;

public class Prime_or_not {
public static void main(String[] args) {
	int count =0;
    int a= 20;
    for(int i =2;i<=a/2;i++)
    {
    	if(a%i==0)
    		count++;
    }
    if(count==0)
    {
    	System.out.println("is a prime number");
    }
    else
    {
    	System.out.println("not prime number");
    }
	}
}
