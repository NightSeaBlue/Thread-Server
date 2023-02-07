package thread.basic;

class Count {
	int i = 0;
	void increment() {
		synchronized (this) {
			i++;
		} // 함수의 동기화
	}
}

class ThreadCount extends Thread {
	Count cnt;
	ThreadCount(Count _cnt) { cnt = _cnt; }
	public void run() {
		for (int i=0; i <100000000 ; i++) {
			cnt.increment();
		}
	}
}

public class Ex07_Synch {

	public static void main(String[] args) {
		Count count = new Count();
		ThreadCount tc1 = new ThreadCount(count);
		tc1.start();
		
		ThreadCount tc2 = new ThreadCount(count);
		tc2.start();
		
		try {
			// Thread의 경우 Main 함수보다 뒤늦게 실행되므로, 함수가 끝날 때까지 join을 통해 대기시킨다.
			tc1.join();
			tc2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("i의 결과 : "+count.i);

	}

}
