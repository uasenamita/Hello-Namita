package Number_loop;

public class Multiplication_tables {
public static void main(String[] args) {
	int a  =0;
	for(int i=12;i<=20;i++)
	{
		for(int j=1;j<=10;j++)
		{
			a=i*j;
			System.out.println(i+"*"+j+"="+a);
		}
		System.out.println("=========");

	}
}
}
