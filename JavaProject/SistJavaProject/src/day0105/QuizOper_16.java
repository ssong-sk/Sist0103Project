package day0105;

import java.util.Scanner;

public class QuizOper_16 {

	public static void main(String[] args) {
		/*
		 *(점수에 대한 조건은 90점이상: 매우잘함 80점이상: 잘함 70점이상 : 좀 더 노력할것 70점미만 : 꽝
		 * 이름을 입력해주세요
		 * 김민아
		 * 자바 시험점수를 입력해주세요
		 * 88
		 * 
		 * ========================
		 * 김민아님의 시험 결과는 잘함 입니다.
		 * ========================
		 * 
		 */

		
		Scanner sc = new Scanner(System.in);
		
		String x, z;
		int y;
		
		System.out.println("이름을 입력해주세요 : ");
		x = sc.nextLine();
		System.out.println("자바 시험점수를 입력해주세요 : ");
		y = sc.nextInt();
		
		
		System.out.println("==================================");
		
		
		//if 문
		/*if(y >= 90) {
			z = "매우잘함";
		}
		
		else if(y >= 80) {
			z = "잘함";
		}
		else if(y >= 70) {
			z = "좀 더 노력할것";
		}
		else {
			z = "꽝";
		}*/
		
		
		//삼항
		
		z = y >= 90 ? "매우잘함" :
			y >= 80 ? "잘함" :
				y >= 70 ? "좀 더 놀력할것" : "꽝!!!";
			
				
					System.out.printf("%s님의 시험 결과는 " + z + "입니다.",x);
					System.out.println("\n==================================");
					
		
	}

}
