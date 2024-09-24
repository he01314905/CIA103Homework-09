package DCpractice;

import java.util.Scanner;

public class Derivative {

	public static void main(String[] args) {
		// x^2=2x 5x^6=30x^5 4x^5=20x^4
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		String[] deri = sc.nextLine().split("x");
		a = Integer.parseInt(deri[1].substring(1));
		
		if (deri[0] != "") 
		{
			b = Integer.parseInt(deri[0]);
			int c = a - 1;

			if (c <= 1)
			{
				System.out.println(a * b + "x");
				System.out.print("");
			} else 
				{
				System.out.println(a * b + "x^" + c);
				}
		} else if(deri[0] == "" && a>2)
			{
			System.out.println(a + "x^"+ (int)(a-1));
			}
		else {
			System.out.println(a + "x");
		}

	}
}
