package demopack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(55);
		list.add(45);
		list.add("Ashish");
		list.set(2, 66);
		Demo d = new Demo(5);
		Demo d1 = new Demo(5);
		Demo d2 = null;
		HashSet<Demo> hs = new HashSet<>();
		hs.add(d);
		hs.add(d1);
		
		System.out.println("Hashset"+hs);
		
		
		System.out.println(list.get(2).equals(list.get(1)));
		list.add(d);
		for (Object object : list) {
			System.out.println(object);
			
		}
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object =  it.next();
			System.out.println("iterator :"+object);
			
			
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.err.println(list.get(i));
		}

	}

}
