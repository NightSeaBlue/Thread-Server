package thread.basic;

public class Ex01_ThreadTest {

	public static void main(String[] args) {
		MakeCar1 mc1 = new MakeCar1("차량 제작");
		mc1.start();
		
		MakeCar1 mc2 = new MakeCar1("다른 차량 제작");
		mc2.start();
		
		System.out.println("작업 완료");
	}

}

