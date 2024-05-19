package Collection;

import java.util.ArrayList;

public class Program_ArrayList {
	public static void main(String[] args) {
		
		ArrayList li = new ArrayList();//class 
	   System.out.println("print original collection");
		li.add(0, 0);
		li.add(1, true);
		li.add(2, "nam");
		li.add(3, 'e');
		System.out.println(li);
		System.out.println("after removal of 0 index");
		li.remove(0);
		System.out.println(li);
		System.out.println("get value of 2 index ---> "+li.get(2));
		//----------------take another collection-----------
		ArrayList l2 = new ArrayList();
		l2.add(0, li);
		l2.add(1, "manisha");
		System.out.println("print l2 collection");
		System.out.println(l2);
		//-----------------allow null value , duplicate value, maintain insertion order , value can add by using index as well
		ArrayList l3 = new ArrayList();//class
		l3.add(0, 1);
		l3.add(1, 1);
		l3.add(2, 0);
		
		System.out.println(l3);
		//ArrayList l3= {2,3,4}; not possible
		
	}

}
