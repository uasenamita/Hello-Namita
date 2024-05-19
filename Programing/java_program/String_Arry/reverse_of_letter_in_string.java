package String_Arry;

public class reverse_of_letter_in_string {

	public static void main(String[] args) {
		
		String s ="My name is Khan";
		String[] split = s.split(" ");
		for(int i=0;i<split.length-1;i++)
		{
			char[] ch = split[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
		
	}

}
