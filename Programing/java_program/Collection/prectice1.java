package Collection;

import java.util.HashSet;

public class prectice1 {
	public static void main(String[] args) {
		HashSet Ha = new HashSet();
	
		Ha.add(2);
		Ha.add(2.1);
		Ha.add(3);
		Ha.add(2);
		Ha.add(6);
		Ha.add(0);
		Ha.add("manisha");
		Ha.add(0.1);
		Ha.add('e');
		Ha.add(true);
		Ha.add(0.3);
		Ha.addAll(Ha);
		
		System.out.println(Ha);
	}
}
