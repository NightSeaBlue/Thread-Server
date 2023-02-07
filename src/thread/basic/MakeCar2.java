package thread.basic;

public class MakeCar2 implements Runnable {

	String work;

	MakeCar2(String _work) {
		work = _work;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(work + " 작업 중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
