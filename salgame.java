package yyy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class salgame {
	private int income;
	private int spend;

	public salgame() {
	};

	public void setincome(int income) {
		this.income = income;
	}

	public void setspend(int spend) {
		this.spend = spend;
	}

	public int getincome() {
		return income;
	}

	public int getspend() {
		return spend;
	}

	public void live() {
		if (income > spend) {
			if (income > spend * 2) {
				System.out.println("財務狀況穩定");
				return;
			}
			System.out.println("財務狀況良好");
			return;
		}

		if (income == spend) {
			System.out.println("財務平衡");
			return;

		}
		System.out.println("財務赤字，請節省開支");
	}

	public static void main(String[] args) {

		salgame sg = new salgame();

		while (true) {

			Scanner sc = new Scanner(System.in);
			try {
				if (sg.getincome() == 0) {
					System.out.println("輸入收入");
					int a = sc.nextInt();
					if (a <= 0)continue;
					sg.setincome(a);
				}

				System.out.println("輸入支出");
				int b = sc.nextInt();
				if (b <= 0)	continue;
				sg.setspend(b);

				sg.live();
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("只能輸入正數");
			}
		}

	}
}
