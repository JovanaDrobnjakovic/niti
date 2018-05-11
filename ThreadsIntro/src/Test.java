import java.sql.Time;
import java.util.Timer;

public class Test {
	
		public void simpleDelay() {
			System.out.println("Wait 2s..");
			long l1 = System.currentTimeMillis();
			while (System.currentTimeMillis() < (l1 + 2000)) {

			}
			System.out.println("done");
		}
	public synchronized void waitDelay() {
		System.out.println("Wait 2s..");
		long l1 = System.currentTimeMillis();
		try {
			wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

	public synchronized void  loopdelay() {
		System.out.println("Wait 2s 5 times..");
		long l1 = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			
		
		try {
			wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i+1);
		}
		System.out.println("done");}
	
	
	public void testThraidWait() {
		WaitThread w = new WaitThread();
		//w.start(); ne znam u waitu treadu kako se implementira metoda
		System.out.println("trivial...");
	}
	public synchronized void TestTimer() {
		Timer timer = new Timer();
		TestTimerTask ttt = new TestTimerTask(timer);
		System.out.println("Wait 2s 5 times..");
		timer.schedule(ttt, 2500);
		long l1 = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			
		
		try {
			wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i+1);
		}
		System.out.println("done");}
		
	
	}


