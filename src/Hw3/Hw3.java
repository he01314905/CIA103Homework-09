package Hw3;

import java.util.Random;
import java.util.Scanner;

public class Hw3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
//		(提示:Scanner,三角形成立條件,判斷式if else)
//		(進階功能:加入直角三角形的判斷)

//		System.out.println("請輸入三個數:");
//		int tr1=sc.nextInt();
//		int tr2=sc.nextInt();
//		int tr3=sc.nextInt();
//		if(tr1==0 || tr2==0 || tr3==0) {
//			System.out.println("不是三角形");
//		}
//		else if(tr1==tr2 && tr2==tr3) {
//			System.out.println("正三角形");
//		}else if((tr1==tr2 ||tr2==tr3 || tr1==tr3)) {
//			System.out.println("等腰三角形") ;
//		}else if(Math.pow(tr1, 2)+ Math.pow(tr2, 2)==Math.pow(tr3, 2)||Math.pow(tr1, 2)+ Math.pow(tr3, 2)==Math.pow(tr2, 2)||Math.pow(tr2, 2)+ Math.pow(tr3, 2)==Math.pow(tr1, 2)) {
//			System.out.println("直角三角形");
//		}else {		
//		System.out.println("其他三角形");
//		}

//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//		(提示:Scanner,亂數方法,無窮迴圈)
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

//		System.out.println("請輸入0~100:");
//		int r = (int) (Math.random() * 100) ;
//		System.out.println(r);
//		int guess = sc.nextInt();
//		while (guess != r) {
//			if (guess > r) {
//				System.out.println("小一點");
//				guess = sc.nextInt();
//			} else if (guess < r) {
//				System.out.println("大一點");
//				guess = sc.nextInt();
//			}
//		}
//		System.out.println("恭喜輸入正確");

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

		int sum = 0;
		System.out.println("輸入O-9");
		int data1 = sc.nextInt();
		for (int i = 1; i <= 49; i++) {
			if ((i / 10 != data1 && i % 10 != data1)) {
				System.out.print(i + " ");
				sum++;
			}
		}
		System.out.println();
		System.out.print("選出的號碼為:");
		int[] a = new int[6];
		int[] d = new int[6];
		boolean c;
		for (int i = 0; i < 6; i++) {
			do {
				c = false;
				a[i] = (int) (Math.random() * 49) + 1;
				for (int j = 0; j < i; j++) {
					if (a[i] == a[j]) {
						c = true;
					}else if (a[i] / 10 == data1 || a[i] % 10 == data1) {
						c=true;
						break;
					}								
				}
			} while (c);
				System.out.print(a[i] + " ");
			}						
		System.out.println();
		System.out.print(" 共有:" + sum + "個");
		//會有錯誤
	}
}