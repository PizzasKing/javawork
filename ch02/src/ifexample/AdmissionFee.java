package ifexample;

import java.util.Scanner;

public class AdmissionFee {
	
	public static void main(String[] args) {
		// 놀이 공원 입장료 계산
		// 취학전 아동-1000 초등-2000 중.고등-2500 성인-3000
		// 변수 - 나이(age) 입장료(fee)
		
		int price = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("고객님의 나이를 입력하시고 모두 입력했으면 0을 눌러주세요. \n");
		int age= scanner.nextInt();
		while(age>0) {{
			if(age<8 && age>0) {
			    price+=1000;
			    System.out.println("아동입니다.현재가격: "+price+"원\n");
			    age=0;

			}
			else if(age>=8 && age<14) {
			    price+=1500;
			    System.out.println("초등학생입니다.현재가격: "+price+"원\n");
			    age=0;
			    }
		    else if(age>=14 && age<17) {
			    price+=2000;
			    System.out.println("중학생입니다. 현재가격: "+price+"원\n");
			    age=0;
			  
			}
		    else if(age>=17 && age<20) {
			    price+=2500;
			    System.out.println("고등학생입니다. 현재가격: "+price+"원\n");
			    age=0;
		    }
		    else if(age>=20) {
		    	price+=3000;
		    	System.out.println("성인입니다.  현재가격: "+price+"원\n");
		    	age=0;
		    }
		    else if(age==0) {
		    	
		    	break;
		    }
			
		}
		System.out.println("고객님의 나이를 입력하시고 모두 입력했으면 0을 눌러주세요. \n");
		age= scanner.nextInt();
		}
		System.out.println("총 가격은 "+price+"원 입니다.\n");
		scanner.close();
	}
	
}
		
		
		
		
		
	
	

