package dc_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

//撰寫一個 Java 程式，讓使用者輸入他們的收入和支出，並根據以下條件給出建議：
//若使用者的收入大於支出兩倍，輸出「財務狀況穩定」。
//若收入等於或小於支出的兩倍且大於支出，輸出「財務狀況良好」。
//若收入等於支出，輸出「財務平衡」。
//若收入小於支出，輸出「財務赤字，請節省開支」。
//若任何一個輸入不是正數，應輸出錯誤訊息，並要求重新輸入。
public class IncomeSpend {
	private int income;
	private int spend;

	public IncomeSpend() {
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
		IncomeSpend sg = new IncomeSpend();
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
