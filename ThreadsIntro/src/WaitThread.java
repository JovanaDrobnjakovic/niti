
public class WaitThread {
	public void run() {
		threadWait();

	}

	synchronized void threadWait() {
		System.out.println("Wait 2s 5 times..");
		long l1 = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {

			try {
				wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + 1);
		}
		System.out.println("done");
	}
}
