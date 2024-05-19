package String_Arry;

public class Duplicate_characters {

	public static void main(String[] args) {
		String st ="Manishah";
		int count=0;
		String dup="";
		char[] ch = st.toCharArray();
		System.out.println("Print duplicate characters");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					dup=dup+ch[i]+" ";
					
				}
			}
	    }
		System.out.println(dup);
	}

}
