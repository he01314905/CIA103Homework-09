package hw2;

public class hw2 {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int i = 1;
		int j = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				j += i;
			}

		}
		System.out.println(j);
		// • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int k = 1;
		for (i = 1; i <= 10; i++) {

			k *= i;
		}
		System.out.println(k);
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int q = 1;
		int w = 1;
		while (w <= 10) {
			q *= w;
			w++;
		}
		System.out.println(q);

//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int e = 1;
		int r = 1;
		for (e = 1; e <= 10; e++) {
			r = (int) Math.pow(e, 2);
			System.out.print(r + " ");
		}
		System.out.println();

//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int t = 1;
		int sum = 0;
		for (t = 1; t <= 49; t++) {
			if ((t % 10 != 4 && t / 10 != 4)) {
				System.out.print(t + " ");
				sum++;
			}

		}
		System.out.println();
		System.out.println("共有" + sum + "個 \n");

//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int x;
		int y;
		for (x = 10; x >= 1; x--) {
			for (y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		System.out.println();
//		• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		char n = 65;
		for (int p = 1; p <= 6; p++) {
			for (int l = 1; l <= p; l++) {
				System.out.print(n);

			}
			System.out.println();
			n++;
		}
		//String[] s= {"A","BB","CCC","DDDD","EEEEE","FFFFFF"};
//		for(int i =0;i<s.length;i++) {
//			
//			System.out.println(s[i]);
//		}
		
		// 99乘法表
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println("");
//			
//		}

//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			 do{
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}while (j <= 9);
//			System.out.println("");
//		}
//		int i = 1;
//
//		while (i <= 9) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			i++;
//			System.out.println("");
//		}
		
	}
}
