package thread.basic;

public class Ex02_RunnableTest {

	public static void main(String[] args) {
		MakeCar2 mc1 = new MakeCar2("차량 제작");
		Thread t1 = new Thread(mc1);
		t1.start();
		
		new Thread(new MakeCar2("엔진부착")).start();
		
		System.out.println("작업 완료");
	}

}


