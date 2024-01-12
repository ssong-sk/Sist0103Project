package day0112;

public class Manager_04 extends EmpIoyee_04 {

	String depart;

	public Manager_04(String name, int sal, String d) {
		super(name, sal); // 부모생성자 호출
		depart = d; // depart 초기화값
	}
	
	//재정의된 메서드 _ 하위클래스에서 부모클래스의 메서드를 수정해서 사용하는 것
	//상속이 전제 조건, 메서드명이 동일해야함,메서드 리턴타입도 동일
	@Override //오버라이딩이 됨....
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee() + "," + depart;
	}

}
