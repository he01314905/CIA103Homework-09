package hw8;

import java.util.ArrayList;
import java.util.List;

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
public static void main(String[] args) {
		List<Train> li = new ArrayList<Train>();
		li.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		li.add(new  Train(1254, "區間", "屏東", "基隆", 700));
		li.add (new Train(118, "自強", "高雄", "台北", 500));
		li.add (new Train(1288, "區間", "新竹", "基隆", 400));
		li.add (new Train(122, "自強", "台中", "花蓮", 600));
		li.add (new Train(1222, "區間", "樹林", "七堵", 300));
		li.add(new Train(1254, "區間", "屏東", "基隆", 700));
	}
}

