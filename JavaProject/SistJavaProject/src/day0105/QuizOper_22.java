package day0105;

import java.util.Scanner;

public class QuizOper_22 {

	public static void main(String[] args) {
		/*
		 * 
		 * 상품명 : 키보드
		 * 수량 : 5
		 * 가격 : 20000
		 * 
		 * ========================
		 * **5개 이상 구매시 10% 할인됩니다**
		 * 키보드 5개는 총 90000원 입니다
		 * 할인된 금액 : 10000원
		 * 
		 */

		
		// x 상품명, y 수량, z 가격, s 총가격, m 할인된 금액
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y, z, s, m ;
		
		
		System.out.print("상품명 : ");
		x = sc.nextLine();
		System.out.print("수량 : ");
		y = sc.nextInt();
		System.out.print("가격 : ");
		z = sc.nextInt();
		
		
		System.out.println("=======================");
		System.out.println("5개 이상 구매 시 10% 할인됩니다.");
		
		s = y * z;
		m = s / 10;
		
		
		if (y >= 5 ) {
			s = s / 10 * 9;
		}
		
		
		System.out.printf("\n%s %d개는 총 %d원 입니다.",x,y,s);
		System.out.printf("\n할인된 금액은 %d 입니다.",m);
		
		
		
		
	}

}
