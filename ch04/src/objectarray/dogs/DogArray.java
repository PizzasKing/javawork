package objectarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		Dog[] dogs= {
				new Dog("백구", "진돗개"),
				new Dog("해피", "시츄"),
				new Dog("대박", "불독"),
				new Dog("사랑", "치와와")
		};
		
		
		for(int i=0; i<dogs.length;i++) {
			System.out.println(dogs[i].getName()+", " + dogs[i].getType());
		}
		

	
	}
}
