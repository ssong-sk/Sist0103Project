package day0115;

import java.io.IOException;
import java.io.InputStream;

//Stream : 바이트 단위로 처리 (뒤에 붙으면)
//writer, reader : 대부분 문자로 처리
//BufferReader : 해당 클래스는 스트림으로부터 데이터를 읽어올 떄 한줄씩 읽을 수 있는 readline() / 많이사용
//BufferWriter : flush() 메소드를 호출해서 버퍼의 내용을 전송하는 작업이 추가로 필요함.
public class IOExcep_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in; //콘솔에서 입력받기 위한 노드 스트림.
		int a = 0;
		
		System.out.println("한글자 입력");
		try {
			a = is.read(); //1바이트 읽는것(1바이트는 한글을 읽을 수 없음).. 리턴값은 아스키코드
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("오류 : " +  e.getMessage());
		}

		System.out.println("***3초 뒤에 출력합니다.***");
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		System.out.println("입력값 : " + (char)a);
		
	}

}
