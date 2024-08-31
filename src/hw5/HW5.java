package hw5;

import java.util.Scanner;

public class HW5 {
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int w=sc.nextInt();
//		int h=sc.nextInt();
//		starSquare(w,h);
		randAvg();
	}

	public static void starSquare(int width, int height) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void randAvg() {
		int rc = 0;
		for (int i = 1; i <= 10; i++) {
			int r = (int) (Math.random() * 101);
			System.out.print(r + " ");
			rc += r;
		}
		System.out.println();
		System.out.println(rc / 10);
	}
}
