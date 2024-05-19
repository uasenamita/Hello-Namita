package String_Arry;

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="M";
       
       char[] charArray = a.toCharArray();
       String s="";
       
       for(int i=a.length()-1;i>=0;i--)
       {
    	   s=s+charArray[i];
       }
       if(a.equalsIgnoreCase(s))
    	   System.out.println("Palindrome");
       else
    	   System.out.println("Not Palindrome");
	}
  
}
