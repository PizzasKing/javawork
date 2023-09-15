package methods;

public class OneUpTest2 {
	// static 키워드를 붙인 변수 - 정적 변수
	// 정적 변수는 생성된 후 프로그램이 종료될때 소멸
	// 특징 - 값을 공유, 누적
	static int x =1; //전역 변수
	
	public static int oneUp() {
		x += 1;
		return x;
	}

	public static void main(String[] args) {
		System.out.println(oneUp());
		System.out.println(oneUp());

	}

}
