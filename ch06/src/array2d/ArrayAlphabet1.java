package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력
//		char c = 'A';
//		System.out.println(c);
//		System.out.println((int)c);
//		
//		char c2=66;
//		System.out.println(c2);
//		System.out.println((int)c2);
//		
//		for(char i = 'A'; i<='Z'; i++) {
//			System.out.print((int)i+" ");
//		}
		//for (char ch = 65; ch <= 90; ch++) {
		//	System.out.print(ch +" ");
	//	}
		
		System.out.println("알파벳을 배열에 넣고 출력");
		char [] alphabets = new char[26];
		char ch ='A';
		
		alphabets[0]=ch;
		System.out.println(alphabets[0]);
		alphabets[1]=(char)(ch +1);
		System.out.println(alphabets[1]);
		
		for(int i=0; i<alphabets.length;i++) {
			alphabets[i]=ch;
			ch++;
		}
		
		for(int i=0; i<alphabets.length;i++) {
			System.out.print(alphabets[i]+" ");
		}

		

	}

}
