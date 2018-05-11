import java.util.Timer;
import java.util.TimerTask;

public class TestTimerTask extends TimerTask{

	public TestTimerTask(Timer timer) {
		super();
		this.timer = timer;
	}


	Timer timer;
	
	
	@Override
	public void run() {
		testTimerTask();
		
	}


	private synchronized void testTimerTask() {
		System.out.println();
		System.out.println("Hi..");
		System.out.println();
		timer.cancel();
		timer.purge();
		//sa purge on cisti i druge timere
		//cancel-kada se nit zavrsi ako nam timer vise ne treba, zaustavlja crvenu tackicu
	}

}
