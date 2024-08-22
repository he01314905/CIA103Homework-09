package hw1;



public class hw1 {
	public static void main(String[] args) {
		int sec = 256559 % 60;
		int sec1= 256559 / 60;
		int min = sec1 % 60;
		int min1=sec1 / 60;
		int hour = min1 % 24;
		int day = min1 / 24;
		final double PI=3.1415;
		int p=1_500_000;double r=0.02; int n=10;
		System.out.println("和為:"+ (12+6) +" 積為:"+ 12*6); //請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println(200/12 + "打" + 200%12 + "顆");
		System.out.println(day + "天" +hour+"時"+min+"分"+sec+"秒");
		System.out.printf("面積為: %.4f",5*5*PI);
		System.out.printf(" 周長為: %.4f", 5*2*PI);
		double bk = p*Math.pow(1+r, n);
		System.out.println("\n本金+利息:"+(int)bk );
		System.out.println(5+5); //int數值相加
		System.out.println(5+'5'); // char ascii碼5為53
		System.out.println(5+"5"); // 此為串接 
		
	}
}
