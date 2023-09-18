package polymorphism.animals2;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class moveAnimal {
	}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥합니다.");
	}
	
}
public class AnimalTest {
	

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		//Animal 타입으로 객체 생성(다형성), 자동 형변환
		
		
		Animal animal = new Human();
		Animal tiger = new Tiger();
		animal.move();
		
		//강제 형변환 - instanceof 키워드 사용
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		if(tiger instanceof Tiger) {
			Tiger t = (Tiger)tiger;
			t.hunting();
			
		}


}
}

