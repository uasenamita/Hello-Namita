package String_Arry;

public class Inticapital {
	public static void main(String[] args) {
		
	String ap = "my name is namita";
	char [] ch = ap.toCharArray();
	
	for(int i =0;i<ch.length;) {
		{
		if (i==0||(ch[i]!=' '&&ch[i-1]==' '))
		{
		if (ch[i]>=97&&ch[i]<=122)
		{
		ch[i]=(char)(ch[i]-32);
		}
		else if (ch[i]>=65&&ch[i]<=90)
		{
		ch[i]=(char)(ch[i]-32);
		}
		}
		}
		ap=new String(ch);
		System.out.println(ap); 
	}

}
}