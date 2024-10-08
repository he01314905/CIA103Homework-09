package hw9;

public class Competition implements Runnable {
	int count = 1;
	String name;
	int r = (int) (Math.random() * 2501) + 500;

	public Competition(String name) {
		this.name = name;
	}

	public void run() {
		while (count <= 10) {
			System.out.println(name + "吃了" + count + "碗");
			count++;
			try {
				Thread.sleep(r);
			} catch (Exception e) {
			}
		}
		System.out.println(name + "吃完了!");
	}

	public static void main(String[] args) {
		System.out.println("--比賽開始--");
		Competition hw1 = new Competition("饅頭人");
		Competition hw2 = new Competition("詹姆士");
		Thread t1 = new Thread(hw1);
		Thread t2 = new Thread(hw2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
		}
		System.out.println("--比賽結束--");
	}
}
