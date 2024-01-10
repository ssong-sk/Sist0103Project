package day0109;

import java.util.Scanner;

public class QuizFor_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		quiz1();
		quiz2();

		quiz3();
	}

	public static void quiz1() {
		/*
		 * Q.팩토리얼 구할 숫자를 입력하여 해당숫자에 대한 팩토리얼 구하기
		 * 
		 * 팩토리얼 구할 숫자 입력 3 3! = 6 등으로 3줄나오기
		 */

		// 팩토리얼 구하는공식 *=

		Scanner in = new Scanner(System.in);

		int num = 0;
		int tot = 1;

		for (int j = 1; j <= 3; j++) {
			System.out.println("숫자를 입력하세요");
			num = in.nextInt();

			for (int i = 1; i <= num; i++) {

				tot *= i;

			}
			System.out.println(num + "!" + "=" + tot);

			tot = 1;
		}
		System.out.println("--------------------------------------------------");

	}

	public static void quiz2() {

		/*
		 * Q. 두 수 x,y를 입력 후 x의 y승 _ for 문을 이용해서 구하시오 (x를 y횟수만큼 곱하는것)
		 * 
		 * 두수 입력 3 3 3의 3승은 27입니다.
		 */

		Scanner in = new Scanner(System.in);

		int x, y;
		int sum = 1;

		System.out.println("두 수를 입력하시오");
		x = in.nextInt();
		y = in.nextInt();

		for (int i = 1; i <= y; i++) {
			sum *= x;

		}
		System.out.println(x + "의 " + y + "승은 " + sum + "입니다.");
		System.out.println("--------------------------------------------------");

	}

	public static void quiz3() {

		/*
		 * Q. 1~100까지의 숫자를 짝수의 합과 홀수의 합을 구해서 출력해주세요.
		 */

		int sum = 0;
		int tot = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				tot += i;
			}

		}

		System.out.println("짝수의 합은 : " + sum + ", 홀수의 합은 : " + tot);
		System.out.println("--------------------------------------------------");

	}
}