package hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Train {
	public int number;
	public String type;
	public String start;
	public String dest;
	public double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void getTrain() {
		System.out.println("車次:" + number + " 車種:" + type + " 出發站:" + start + " 抵達站:" + dest + " 價格:" + price);
	}

	public static void main(String[] args) {
		List<Train> li = new ArrayList<>();
		li.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		li.add(new Train(1254, "區間", "屏東", "基隆", 700));
		li.add(new Train(118, "自強", "高雄", "台北", 500));
		li.add(new Train(1288, "區間", "新竹", "基隆", 400));
		li.add(new Train(122, "自強", "台中", "花蓮", 600));
		li.add(new Train(1222, "區間", "樹林", "七堵", 300));
		li.add(new Train(1254, "區間", "屏東", "基隆", 700));
		TreeMap<Integer,Train> map = new TreeMap();
		Map<Integer,Train> map1 = new HashMap();
	
		for (Train i : li) {
			map.put(i.number,i);
			map1.put(i.number, i);
		}
	//	不重複 沒排序
		for (Train i :	map1.values()) {
			i.getTrain();
		}

		// 不重複 小到大
//		for (Train i :	map.values()) {
//			i.getTrain();
//		}

		
		//不重複 大到小
//		 List<Integer> keys = new ArrayList<>(map.keySet());
//		for(int i = keys.size()-1;i>=0;i--) {
//			Integer key = keys.get(i);
//			Train obj = map.get(key);
//			obj.getTrain();
//		}
		
		
		//迭代器 不重複 小到大
//		Set<Integer> set = map.keySet();		
//		Iterator<Integer> it= set.iterator();
//		while(it.hasNext()) {
//				int key =  it.next();		
//				Train values = map.get(key);		
//				values.getTrain();
//		}		
		System.out.println();
}

}
