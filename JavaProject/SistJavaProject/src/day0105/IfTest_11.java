package day0105;

public class IfTest_11 {

	public static void main(String[] args) {
		// 

		
		int a = 10;
		
		if (a > 5) {
			System.out.println(a + "는 5보다 크다"); //조건이 맞지 않으면 조건식 실행 안하고 종료됨.
		}
		
		
		
		int b = 9;
		
		if (b % 2 == 0) {
			
			System.out.println(b + "는 짝수입니다.");
		}
			
			else {
				System.out.println(b + "는 홀수입니다.");
			}
		
		System.out.println("if문 종료!!!!");
	}

}
