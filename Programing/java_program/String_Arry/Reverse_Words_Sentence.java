package String_Arry;

public class Reverse_Words_Sentence {
	public static void Sringmain(String[] args) {
		String st = "My name is Khan ";
	    String [] sp =  st.split(" ");
	    for(int i=0;i<=3;i++)
	    {
	     char ch [] =sp[i].toCharArray();
			for(int k=ch.length-1;k>=0;k--)
			{
				System.out.print(ch[k]);
			}
			System.out.print(" ");
	    }    		
	
	}
}