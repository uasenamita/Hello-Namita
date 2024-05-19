package Collection;

import java.util.ArrayList;

public class Prectice {
	public static void main(String[] args) {
		
		ArrayList Ar= new ArrayList();
		   System.out.println("print original collection");	
		Ar.add(0,2);
		
		Ar.add(0,1);
		Ar.add(1,"name");
		Ar.add(1,true);
		//Ar.addAll(Ar);
		System.out.println(Ar);
		Ar.remove(0);
		System.out.println("after removal of 0 index");
		System.out.println(Ar);
}
}