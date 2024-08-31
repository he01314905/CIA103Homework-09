package hw5;

import java.lang.reflect.Array;
import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//		圖:
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int w=sc.nextInt();
		int h=sc.nextInt();
		starSquare(w,h);

//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		System.out.print("本次亂數結果:");
		randAvg();
//		利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//		可以找出二維陣列的最大值並回傳,如圖:
		int Array[][] = { { 1, 6, 3 }, { 9, 5, 2 } };
		double doubleArray[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Work03 area = new Work03();
		System.out.println(area.maxElement(Array));
		System.out.println(area.maxElement(doubleArray));
		System.out.println();
		
//		身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//		genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//		與數字的亂數組合,如圖:
		System.out.println("本次產生的驗證碼為:");
		genAutoCode();
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
		System.out.println("亂數的平均為:" + rc / 10);
	}

	public static void genAutoCode() {
		int r[] = new int[8];
		boolean c = true;
		for (int i = 0; i < r.length; i++) {
			do {
				c = false;
				int ra = (int) (Math.random() * 75) + 48;
				if ((ra > 47 && ra < 58) || ra > 64 && ra < 91 || ra > 96 && ra < 123) {
					r[i] = ra;
					break;
				} else {
					c = true;
				}
			} while (c);
			System.out.print((char) r[i]);
		}
	}

}
