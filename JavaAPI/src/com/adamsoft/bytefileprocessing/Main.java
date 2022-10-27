package com.adamsoft.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {

		//바이트 단위로 파일에 기록하기
		try {
			
			//UUID.random UUID
			String f = UUID.randomUUID().toString();
			//기록할 파일 만들기
			FileOutputStream file = new FileOutputStream(
					"./"+ f +".txt", true);
			
			String name = "랜덤으로 이름생성";
			file.write(name.getBytes());
			
			file.close();
			
			
		} catch (Exception e) {
			System.out.println("파일기록 실패");
			System.out.println(e.getLocalizedMessage());
		}
		
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기위한 파일생성
			FileInputStream fi = new FileInputStream("./2022-10-27-11-44.txt");
			//읽어서 저장할 바이트 배열을 생성
			byte[ ] b = new byte[fi.available()];
			//읽기
			fi.read(b);
			//읽은 내용 확인 - 문자열로 변환
			System.out.println(new String(b));
			//읽은 내용 확인 - 코드값확인
			System.out.println(Arrays.toString(b));
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
		
	}

	
	
}
