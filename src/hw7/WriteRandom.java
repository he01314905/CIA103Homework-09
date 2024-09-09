package hw7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriteRandom {
public static void main(String[] args) {
	List li =new ArrayList();
	int r=(int)(Math.random()*1000)+1;
	li.add(r);
	Iterator it=li.iterator();
	for(int i=0;i<li.size();i++) {
		Object obj=li.get(i);
	while (it.hasNext()) {
		
		
	}
	System.out.println(obj);
	}
	
}
}
	



