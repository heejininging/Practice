package com.adamsoft.characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CharacterFileMain {

	public static void main(String[] args) {
		//파일에 문자열을 문자단위로 기록하기 : FileWriter와 PrintWriter이용
		 try {
			//버퍼를 이용해서 파일에 문자열을 기록하는 클래스의 객체생성
			 /*
			  * 파일명 뒤에 true를 붙이면 텍스트 이어서 기록,
			  * false를 붙이거나 생략하면 새로 기록
			  */
			 PrintWriter pr = new PrintWriter(
					 new FileWriter("ch.txt", true));
			 
			 //문자열을 기록
			 //문자열을 기록할 때( ,나 공백 및 탭 )등으로 구분이 가능한데
			 //이렇게 만들어진 텍스트를 csv라고 합니다.
			 //이 방식은 변하지 않는 고정적인 데이터를 기록할때 주로 이용
			 pr.print("인삿말, 안녕하세요.\n");
			 pr.print("반가워요\n");
			 
			 //버퍼의 내용 전부 출력
			 pr.flush();
			 
			 //닫기
			 pr.close();
			 
		 } catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		//파일에서 문자열을 문자단위로 읽어오기 : FileReader와 BufferedReader이용
		 try {
			BufferedReader bf = new BufferedReader(
					new FileReader("./ch.txt"));
			 
			//줄단위로 읽어서 출력하기
			while(true) {
				//한줄읽기
				String line = bf.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
//				System.out.println(line);
				
				//읽은데이터에서 ,를 기준으로 앞의 데이터만 출력
				String[] arr = line.split(",");
				System.out.println(arr[0]);
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		 

	}

}
