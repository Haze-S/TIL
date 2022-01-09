package ch22;

class Bank {
	
	private int money = 10000;
	
	public void saveMoney(int save) {
			int m = getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m + save);
		
	}

	public void minusMoney(int minus) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
		
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread {
	public void run() {
		synchronized (SyncMain.bank) {
			System.out.println("start save");
			SyncMain.bank.saveMoney(3000);
			System.out.println("saveMoney(3000) : " + SyncMain.bank.getMoney());	
		}
	}
}

class Kim extends Thread {
	public void run() {
		synchronized (SyncMain.bank) {
			System.out.println("start minus");
			SyncMain.bank.minusMoney(1000);
			System.out.println("minusMoney(1000) : " + SyncMain.bank.getMoney());
		}
	}
}

public class SyncMain {
	
	public static Bank bank = new Bank();

	public static void main(String[] args) {

		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Kim k = new Kim();
		k.start();
	}

}
