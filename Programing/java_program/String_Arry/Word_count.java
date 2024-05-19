package String_Arry;

public class Word_count {
public static void main(String[] args) {
	String sp="Radha and Krishna";
    String [] st = sp.split(" ");
    for(int i=0;i<st.length;i++)
    {
    System.out.println(st[i] + " ->char count= "+st[i].length());
    }
}
}
