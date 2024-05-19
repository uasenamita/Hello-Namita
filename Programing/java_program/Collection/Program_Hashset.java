package Collection;

import java.util.HashSet;

public class Program_Hashset {
public static void main(String[] args) {
	
	HashSet set = new HashSet();
	
	set.add(2);
	set.add(2.1);
	set.add(3.2);
	set.add(2);
	set.add(6);
	set.add(0);
	set.add(1);
	set.add("manisha");
	set.add(set);
	set.add(true);
	//do not allow duplicate value/always pick unique , not maintain insertion order ,default maintains ascending order if similar datatype
	//VALUE CANNOT ADD BY USING INDEX
	System.out.println(set);
}
}
