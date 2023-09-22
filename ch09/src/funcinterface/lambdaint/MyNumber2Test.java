package funcinterface.lambdaint;

public class MyNumber2Test {

	public static void main(String[] args) {
		MyNumber2 myNum;
		myNum =(x,y) -> (x>=y) ? x: y;

		
		//getMax() 호출
		System.out.println("더 큰수: "+myNum.getMax(10, 20));

	}

}
