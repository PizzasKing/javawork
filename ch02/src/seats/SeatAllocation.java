package seats;

import java.util.Scanner;

public class SeatAllocation {

	public static void main(String[] args) {
		// 자리 배치도
		// customer, colume, row
		Scanner sc=new Scanner(System.in);
		
		System.out.print("입장객 수: ");
		int customer = sc.nextInt();
		
		System.out.print("좌석 열 수: ");
		int column = sc.nextInt();
		
		int row;
		
		if (customer % column == 0) {
			row = customer/column;
			}
		else {
			row = customer/column +1;
		}
		for(int i=0; i<row; i++) {
			for(int j=1; j<=column;j++) {
				int seatNum=column*i+j;
				if(seatNum > customer) {
					break;
				}
				else
					System.out.print(seatNum);
			}
			System.out.println();
		}
		sc.close();
		
		

	}

}