package day0105;

import java.util.Scanner;

public class IfTset_12 {

	public static void main(String[] args) {
		// 숫자하나를 입력하여 결과를 출력하시오
		/*
		 * 당신이 좋아하는 숫자는?
		 * 99
		 * 
		 * 그 숫자는 홀수입니다.
		 * 다음에 만나요.
		 * 
		 */


		Scanner sc = new Scanner(System.in);

		int x;
		String y;

		System.out.print("당신이 좋아하는 숫자는? ");
		x = sc.nextInt();


		if (x%2 ==1) {
			System.out.println("그 숫자는 홀수 입니다.");
		}

		System.out.println("다음에 만나요.");



		System.out.println("****switch문*********");


		switch(x%2) {
		case 0 :
			System.out.println("짝수");
			break;
		case 1 :
			System.out.println("홀수");
		}










	}

}
