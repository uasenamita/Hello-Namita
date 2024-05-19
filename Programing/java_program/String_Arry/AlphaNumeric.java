package String_Arry;

public class AlphaNumeric {
	public static void main(String[] args) {
		String st = "GeeKs01fOr@gEEks07" ;
		int  upper =0,lower=0,number=0;
		int special=0;
		for(int i =0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A'&& ch<='Z')
				upper++;
			else if(ch>='a'&& ch<='z')
				lower++;
			else if (ch>='0'&& ch<='1')
		         number++;
			else
				special++;
		}
			System.out.println("Upper case letters :"+ upper );
			System.out.println("Lower case letter :"+ lower);
		    System.out.println("Number:"+ number);
		    System.out.println("Special characters :"+ special);
		}
	}
