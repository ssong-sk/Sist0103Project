package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//**과일입고목록**
//번호 과일명 수량 단가 총금액

public class QuizFileException_15 {
	
	public static void fileRead () {
		String fName = "C:\\eclipse\\file\\fruitshop.txt";
		FileReader fr = null;
		BufferedReader br = null;
		int sum = 0;
		int cnt = 0;
		
		try {
			fr = new FileReader(fName);
			br = new BufferedReader(fr);
			
			
			System.out.println("**과일 입고 목록**");
			System.out.println("번호\t과일명\t수량\t단가\t총금액");
			System.out.println("--------------------------------------");

			
			
			while(true) {
				String s = br.readLine();
				
				if(s == null) {
					break;
				}
			cnt++;
			String[] data = s.split(",");
			
			int tot = Integer.parseInt(data[1]) * Integer.parseInt(data[2]);
			System.out.println(cnt + "\t" + data[0] + "\t" + data[1] + "\t" + data[2] + "\t" + tot);
				
				
			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
		}
		finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileRead();

	}

}
