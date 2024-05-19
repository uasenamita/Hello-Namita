package String_Arry;

public class Convet_Uppercase {

	public static void main(String[] args) {
		
		String s ="Manisha";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>96&&ch[i]<123)
				{
				ch[i]=(char)(ch[i]-32);
				System.out.print(ch[i]);
				}
			else
			{System.out.print(ch[i]);}
			
		}
  
	}

}
