package polymorphism.fruits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.바나나 | 3. 복숭아");
		System.out.println(" 선택>");
		
		int selectNo = Integer.parseInt(scanner.nextLine());
		
		Fruit fruit = null;
		if(selectNo == 1) {
			fruit = new Grape();
			
		}else if(selectNo == 2) {
			fruit = new Peach();
		}else if(selectNo == 3) {
			fruit = new Banana();
		}else {
			System.out.println("지원되는 기능이 없습니다.");
		}
		fruit.showFruitInfo();
		
		scanner.close();
	}

}
