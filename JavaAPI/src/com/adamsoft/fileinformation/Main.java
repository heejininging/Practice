package com.adamsoft.fileinformation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	
	public static void main(String[] args) {
		//파일에 대한 정보확인
		
		try {
			//File객체생성
			//Windows에서는 디렉토리 구분기호가 \인데
			//프로그래밍 언어에서는 /가 오고 하나의 문자가 오면 제어문자로 인식
			//\를 입력하고자 할 때는 \\이렇게 해야합니다.
			File file = new File("C:\\Users\\user\\Desktop\\박희진\\공부해야할것.txt");
			
			//파일의 존재여부확인
			System.out.println(file.exists());//있으면 true 없으면 false
		
			//마지막 수정날짜 1663644127269
			System.out.println(file.lastModified());
			//Date 객체생성 Tue Sep 20 12:22:07 KST 2022
			System.out.println(new Date(file.lastModified()));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
			System.out.println(sdf.format(file));
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
	}
	
}
