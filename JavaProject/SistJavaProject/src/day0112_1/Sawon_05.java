package day0112_1;

public class Sawon_05 {

	protected String name; //protected는 자식 클래스에서만 접근이 가능한것.
	protected String buseo;
	

	//메서드
	public void display() {
		System.out.println("**부모 변수 출력**");
		System.out.println("이름 : " + this.name);
		System.out.println("부서 : " + this.buseo);
	}
}
