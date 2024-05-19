package Number_loop;

public class Fiboncci_Range {
public static void main(String[] args) {
	int a=0;
	int b=1;
	
	for(int i=1;i<=10;i++)
	{
		int c=a+b;
		    a=b;
		    b=c;
	}
	System.out.println(a);

}
}
