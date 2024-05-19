package String_Arry;

public class splitwords_in_sentence {

	public static void main(String[] args) {
		
		String s ="Manisha8798#@%HGKK";
		char[] ch = s.toCharArray();
		String uppercase = "";
		String lowercase = "";
		String numbers = "";
		String specialchar = "";
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>96&&ch[i]<123)
				uppercase=uppercase+ch[i];
				
			else if(ch[i]>64&&ch[i]<90)
				lowercase=lowercase+ch[i];
				
			else if(ch[i]>53&&ch[i]<64)
				numbers=numbers+ch[i];
			
			else 
				specialchar=specialchar+ch[i];
		}
		System.out.println("Uppercase -->"+uppercase);
		System.out.println("Lowercase -->"+lowercase);
		System.out.println("numbers -->"+numbers);
		System.out.println("specialchar -->"+specialchar);
	}

}
