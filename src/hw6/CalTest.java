package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws InputMismatchException {
		Calculator pow = new Calculator();
		boolean c = true;
		while (c) {
			
			try {
<<<<<<< HEAD
				
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
=======
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
>>>>>>> 34c379fed99a35169298e9ab721ce078caa4ed36
		}
	}
}
}
