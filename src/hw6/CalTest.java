package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws InputMismatchException {
		Calculator pow = new Calculator();
		Scanner sc = new Scanner(System.in);
		boolean c = true;
		while (c) {
			
			try {
				
				System.out.println("請輸入x的值:");
				int x = sc.nextInt();
				System.out.println("請輸入y的值:");
				int y = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入格式錯誤");
				break;
			}  
			try {
				System.out.println("請輸入x的值:");
				int x = sc.nextInt();
				System.out.println("請輸入y的值:");
				int y = sc.nextInt();
				pow.powerXY(x, y);
				break;
			}
			catch (CalExecption e) {
				System.out.println(e.getMessage());
				System.out.println("請輸入x的值:");
				int x = sc.nextInt();
				System.out.println("請輸入y的值:");
				int y = sc.nextInt();
		}finally {
			sc.close();
		}
	}
}
}
