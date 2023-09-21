package nestedclass;

class A {

	A() {
		System.out.println("A객체 생성");
	}

	// 내부 멤버 클래스
	class B {

		int field1;

		B() {
			System.out.println("B객체 생성");
		}

		void method1() {
		}

	}

	static class C {
		int field1;
		static int field2;

		C() {
			System.out.println("C객체 생성");
		}

		void method1() {
		}

		static void method2() {
		}

	}

	void method1() {
		class D {
			int field1;

			D() {
				System.out.println("D객체 생성");
			}
			void method1() {};
		}
		//d객체 생성
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
}

public class NestedClassTest {

	public static void main(String[] args) {
		// a 객체 생성
		A a = new A();

		//b객체 생성
		A.B b = a.new B();
		b.field1 =3;
		b.method1();

		A.C c = new A.C();
		c.field1 = 2;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//D클래스의 method() 호출
		
	}

}
