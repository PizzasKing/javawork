package basicclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	//매서드
	Runnable getRunnable() {
		//int num = 10; //로컬변수
		
		class MyRunnable implements Runnable{
			int localNum = 20;

			@Override
			public void run() {
				//num = 20; // 상수로 변환되어 변경불가
				System.out.println(outNum + "(외부클래스의 인스턴스 변수)");
				System.out.println(sNum+ "(외부클래스의 정적 변수)");
				System.out.println(localNum+"(내부클래스의 멤버 변수)");
			}
			
		}
		MyRunnable myRun = new MyRunnable();
		return myRun;
		//return new MyRunnable();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();;
	}

}
