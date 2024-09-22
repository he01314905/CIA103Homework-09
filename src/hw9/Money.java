package hw9;

class live {
	private int deposit;

	synchronized public void spend(int cash) {
		while (deposit < cash) {
			System.out.println("熊大沒錢了,真慘");
			System.out.println("熊媽被熊大要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (deposit <= 2000) {
			System.out.println("熊大存款不到2000,請求支援");
		}
		deposit -= cash;
		System.out.println("熊大領了" + cash + ", 帳戶共有 :" + deposit);
		notify();
	}

	synchronized public void pure(int cash) {
		while (deposit > 3000) {
			System.out.println("熊大存款超過3000，不給錢了");
			System.out.println("熊媽跟熊大說有錢了,拿去花");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.err.println("媽媽可以結束匯款惹～");
				return;
			}
		}
		deposit += cash;
		System.out.println("熊媽存了" + cash + ", 帳戶共有 :" + deposit);
		notify();
	}
}

class Spender implements Runnable  {
	live live;

	public Spender(live live) {
		this.live = live;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			live.pure(2000);
		}
	}
}

class Purer implements Runnable  {
	live live;
	public static boolean isFinished = false ;
	public Purer(live live) {
		this.live = live;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			live.spend(1000);
		}
	isFinished=true;
	}
}

public class Money {
	public static void main(String[] args) {
		live live = new live();
		Spender spender = new Spender(live);
		Purer purer = new Purer(live);

		Thread threadMom = new Thread(spender);
		Thread threadSon = new Thread(purer);
		threadMom.start();
		threadSon.start();
		while(true) {
		if(purer.isFinished && threadMom.isAlive()) {
			threadMom.interrupt();
		}
		try {
			
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		if(purer.isFinished && !threadMom.isAlive()) {
			break;
		}
	}


	}
}
