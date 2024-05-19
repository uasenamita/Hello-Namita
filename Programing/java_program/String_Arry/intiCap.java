package String_Arry;

public class intiCap {

	public static void main(String[] args) {
		String s ="Manisha is my name";
		String[] sp = s.split(" ");
		
		for(int i=0;i<sp.length;i++)
		{
			char[] ch = sp[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[0]>96&&ch[0]<123)
				{
					ch[0]= (char)(ch[0]-32);
					System.out.print(ch[0]);
				}
				else
					System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
  

	}

}
