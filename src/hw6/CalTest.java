package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws InputMismatchException {
		Calculator pow = new Calculator();
		boolean c = true;
		while (c) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值:");

				if (sc.hasNextInt() == false) {
					throw new InputMismatchException("輸入格式錯誤");
				}
				int x = sc.nextInt();

				System.out.println("請輸入y的值:");
				if (sc.hasNextInt() == false) {
					throw new InputMismatchException("輸入格式錯誤");
				}
				int y = sc.nextInt();

				pow.powerXY(x, y);
				c = false;

			} catch (CalExecption e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
