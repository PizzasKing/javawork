package arraycopy;

public class ArrayCopyTest2 {

	public static void main(String[] args) {
		// 배열 복사하기 - 문자형 복사
		char[] arr1 = {'N', 'E', 'T'};
		//크기가 3인 arr2 배열 선언
		char[] arr2 = new char[3];
		// 복사 - 저장
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		
		//arr2 출력
		for(int j=0; j<arr2.length;j++) {
			System.out.print(arr2[j]);
		}
		System.out.println("");
		//역순 복사
		char[] arr3 = new char[3];
		for(int k=0; k<arr1.length;k++) {
			arr3[2-k]=arr1[k]; 
		}
		for(int p=0; p<arr3.length;p++) {
			System.out.print(arr3[p]);
		}
	}

}