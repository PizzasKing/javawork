package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {
		MyFunction1 function;
		
		//람다식 표현
		//매개변수 없음
		function = () -> {
			System.out.println("안녕");
		}; 
		
		//실행함수 호출
		function.method();
	}

}
