package thissamples;

public class ThisTest {

	public static void main(String[] args) {
		// 생성된 인스턴스 - bDay 클래스의 this 속성과 주소 같음
		Birthday bDay = new Birthday();
		bDay.setYear(2023);
		System.out.println(bDay);

		bDay.printThis();

	}

}
