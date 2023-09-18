package abstracts.animal;

public class AnimalTest {

	public static void main(String[] args) {
//		Cat cat = new Cat();
//		cat.breathe();
//		cat.sound();
		
		
		Animal cat = new Cat();
		cat.breathe();
		cat.sound();
		
		
		Animal dog = new Dog();
		dog.breathe();
		dog.sound();
		
		System.out.println("=====================");
		
		animalSound(new Dog());
		animalSound(new Cat());
		// 매서드의 매개변수의 다형성
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
