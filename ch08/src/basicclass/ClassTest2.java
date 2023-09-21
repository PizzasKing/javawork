package basicclass;

import java.lang.reflect.Field;

public class ClassTest2 {

	public static void main(String[] args) {
		Person person = new Person();

		System.out.println("====== 클래스의 이름 가져오기 ======");
		Class<?> class1 = person.getClass();
		System.out.println(class1.getName());

		System.out.println("====== 클래스의 필드(멤버변수) 가져오기 ======");
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
	}
}
