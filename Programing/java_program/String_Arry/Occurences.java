package String_Arry;

public class Occurences {
	public static void main(String[] args) {
	String n="malayalam";
	 char [] ch = n.toCharArray();
	 int i,count=0;
	 for( i=0;i<ch.length;i++)
	 { 
		 for(int j=i;j<ch.length;j++)
		 {
			 if(ch[i]==count)
			 {
		    count++;
		   }
	 }
		System.out.println(ch[i]+"="+count+"time");
	 
	 }
	}

}
