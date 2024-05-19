package String_Arry;

public class Reverse_sentence {
	public static void main(String[] args) {
		String st ="My Name Is Khan";
		 String[] sp =st.split(" ");
		 for(int i = 3;i>=0;i--)
		 {
			char[]ch = sp[i].toCharArray();	 
			 for(int j =0;j<=ch.length-1;j++)
			    {
			    	System.out.print(ch[j]);
			    }
		System.out.print(" ");	 
		 }
}}
