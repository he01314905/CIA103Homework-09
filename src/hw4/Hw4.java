package hw4;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int avg = 0;
		for (int i = 0; i < a.length; i++) {
			avg = avg + a[i];
		}
		avg = avg / a.length;
		System.out.println("平均值為:" + avg);
		System.out.print("大於平均值的數字為: ");
		for (int j = 0; j < a.length; j++) {
			if (a[j] > avg) {
				System.out.print(a[j] + " ");
			}
		}
		System.out.println();

//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		String s = "Hello World";
		int g = s.length();
		char[] b = new char[g];
		for (int i = b.length - 1; 0 <= i; i--) {
			b[i] = s.charAt(i);
			System.out.print(b[i]);
		}
		System.out.println();
//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
		String[] star = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length(); j++) {
				switch (star[i].charAt(j)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
				}
			}
		}
		System.out.print("母音總共有:"+count+"個");

//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示:Scanner,二維陣列)
		System.out.println();
		System.out.println("要借的金額:");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[][] emo = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int sum1 = 0;
		System.out.print("有錢可借的員工號碼為:");
		for (int i = 1; i < emo.length; i++) {
			for (int j = 0; j < emo[i].length; j++) {
				if (c <= emo[1][j]) {
					System.out.print(emo[0][j] + " ");
					sum1++;
				}
			}
		}
		System.out.println("");
		System.out.println("共:" + sum1 + "人!");

//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		Scanner sc1 = new Scanner(System.in);
		System.out.println("輸入年");
		int year = sc1.nextInt();
		System.out.println("輸入月份");
		int month = sc1.nextInt();
		System.out.println("輸入天");
		int day = sc1.nextInt();
		int feb;
		int sum = 0;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			feb = 29;
			System.out.println("閏年");
		} else {
			feb = 28;
			System.out.println("不是閏年");
		}
		int[] date = { 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < month - 1; i++) {

			sum += date[i];
		}
		sum +=day;
		if (year <= 0 || month <= 0 || day <= 0 || day > date[month - 1] || month > 12) {
			System.out.println("輸入錯誤,請重新輸入");
		} else {
			System.out.print("輸入的日期為該年第" + sum + "天");
		}
		System.out.println();
		
//		• 班上有8位同學,他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)
		int score[][] = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };
		int sctop[] = new int[8];
		
		for (int j = 0; j < 6; j++) {
			int exam = 0;
			int sctime = 0;
			for (int i = 0; i < score.length; i++) {
				if (score[i][j] > exam) {
					exam = score[i][j];
					sctime = i;
				}
			}
			sctop[sctime] += 1;
		}
		for (int k = 0; k < sctop.length; k++) {
			System.out.println("第 " + (k + 1) + " 號學生考 " + sctop[k] + " 次最高分");
		}
	}
}
