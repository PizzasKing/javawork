package abstracts.animal;

public class Cat extends Animal{
	
	public Cat() {
		this.kind ="고양이";
		System.out.println(kind);
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
