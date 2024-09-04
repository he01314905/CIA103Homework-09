package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws InputMismatchException {
		Calculator pow = new Calculator();
		Scanner sc = new Scanner(System.in);
		boolean c = true;
		System.out.println("請輸入x的值:");
		System.out.println("請輸入y的值:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(sc.hasNextInt()) {
			 x = sc.nextInt();
		}else {
			System.out.println("輸入格式錯誤");
		}
	
		while (c) {
			try {
				pow.powerXY(x, y);
				c = false;
			} catch (CalExecption e) {
				System.out.println(e.getMessage());
				System.out.println("請輸入x的值:");
				x = sc.nextInt();
				System.out.println("請輸入y的值:");
				y = sc.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
			} finally {
				sc.close();
			}
		}
	}
}
