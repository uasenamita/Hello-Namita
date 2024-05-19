package String_Arry;

public class sum_alpha_numeric {
public static void main(String[] args) {
	String sc = "139y1d5801";
	char[] ch = sc.toCharArray();
	 int j= 0;
	 for(int i =0;i<=ch.length-1;i++)
	 {
		 if(ch[i]>=48 && ch[i]<=57)
		 {
			 j=j+ch[i]-48;
	   }
	 }
		 System.out.println(j);	 
}
}