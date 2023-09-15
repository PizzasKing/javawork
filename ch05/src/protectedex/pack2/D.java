package protectedex.pack2;

import protectedex.pack1.A;

//A를 D가 상속받음
//패키지가 달라도 상속관계는 protected에 접근
public class D extends A{
	
	public D() {
		super();
		this.field="yes";
		this.method();
	}
}
