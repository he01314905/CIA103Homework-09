package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hw8 {
	public static void main(String[] args) {
		// Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)
		List li = new ArrayList();
		li.add(new Integer(100));
		li.add(new Double(3.14));
		li.add(new Long(21L));
		li.add(new Short("100"));
		li.add(new Double(5.1));
		li.add("Kitty");
		li.add(100);
		li.add(new Object());
		li.add("Snoopy");
		li.add(new BigInteger("1000"));

		Iterator it = li.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		for (Object a : li) {
			System.out.print(a + ", ");
		}
		System.out.println();
		for (int i = 0; i < li.size(); i++) {
			Object obj = ((ArrayList) li).get(i);
			System.out.print(obj + ", ");
		}
		System.out.println();

		Iterator it2 = li.iterator();
		while (it2.hasNext()) {
			if (!(it2.next() instanceof Number)) {
				it2.remove();
			}
		}
		System.out.println(li);
		System.out.println(li.size());
		for (int i = li.size() - 1; i >= 0; i--) {
			if (!(li.get(i) instanceof Number)) {
				li.remove(li.get(i));
			}
		}
		System.out.print(li);
	}

}
