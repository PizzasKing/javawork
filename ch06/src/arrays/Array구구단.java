package arrays;

public class Array구구단 {

	public static void main(String[] args) {
		//3단 출력
		int dan =3;
		
		int[] gugudan =new int[9];
		for(int i =0;i<gugudan.length;i++) {
			gugudan[i]=(i+1)*dan;
			System.out.println(dan+" x "+(i+1)+" = "+gugudan[i]);
		}
		System.out.println("===================");
		
		//배열 복사
		int[] gugudan2 = new int[9];
		
		//1.일반 복사
		for(int i = 0; i<gugudan2.length; i++) {
			gugudan2[i]=gugudan[i];
		}
		for(int i = 0 ; i<gugudan2.length; i++) {
			System.out.println(dan+" x "+(i+1)+" = "+gugudan2[i]);
		}
		System.out.println("==================");
		
		//2. Object 클래스의 clone()
		int[] gugudan3 = gugudan2.clone();
		
		for(int i = 0 ; i<gugudan3.length; i++) {
			System.out.println(dan+" x "+(i+1)+" = "+gugudan3[i]);
		}
		

	}

}
