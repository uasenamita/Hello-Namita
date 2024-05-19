package String_Arry;

public class AlphaNumeric_1 {
public static void main(String[] args) {
	String sc= "Geeks@01orgEEKS07";
	char [] ch = sc.toCharArray();
	int low=0,upe=0,num=0,spic=0;
	
	for(int i =0;i<ch.length;i++)
	{
		if (ch[i]>=65&&ch[i]<=90)
		{  
			upe++;
		}
		else if (ch[i]>=97&&ch[i]<=122)
		{
		     low++;
		}
		else if (ch[i]>=48&&ch[i]<=57)
		   num++;
		else if(ch[i]==' ')
			spic++;
		
	    System.out.print(ch[i]+"="+low);
		System.out.println(ch[i]+"="+upe);
		System.out.println(ch[i]+"="+num);
		System.out.println(ch[i]+"="+spic);
	
}
}
}