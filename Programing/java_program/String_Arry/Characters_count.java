package String_Arry;

public class Characters_count {
	public static void main(String[] args) {
		String St= "Namita";
	   char[]  ch =St.toCharArray();
	   int count =0;
	   for(int i =0;i<St.length();i++)
	   {
		   if(ch[i]=='a')
		   {
			   count++;
		   }
	   } System.out.println("a"+"="+count);
	}

}
