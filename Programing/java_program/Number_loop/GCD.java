package Number_loop;

public class GCD {
	public static void main(String[] args) {
		int a  = 30;
		int b= 25;
		int gcd=0;
		
	for(int i = 1;i<=a && 	i<=b;i++)
	{
		if(a%i==0 && b%i==0)
		{
			gcd=i;
		}        
		}                                                                                                                                                                                  
		System.out.println("GCD of"+a+"and"+b+"="+gcd);
	
}

	

}
