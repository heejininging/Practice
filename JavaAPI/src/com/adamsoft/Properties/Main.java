package com.adamsoft.Properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
//		Properties 인스턴스 생성
		Properties properties = new Properties();
//		없는 key를 사용하면 null리턴
		System.out.println(properties.getProperty("name")); //null
		
//		프로퍼티스에 프로퍼티저장
		properties.setProperty("A반", "우등생");
		properties.setProperty("B반", "중등생");
		properties.setProperty("C반", "열등생");
		
		//웹서버와 데이터베이스에서는 예외처리필수
		//텍스트 파일로 저장
		try {
			/*
			 * 현재 작업 디렉토리에 파일로 저장
			 * git에 연결되어 있는 경우 workspace가 아닌
			 * c드라이브의 사용자 디렉토리 안-> 자신의 계정 안-> git 디렉토리에 있다.
			 */
//			properties.store(new FileOutputStream("./myproject.properties")
//					, "텍스트로 저장");	
			properties.storeToXML(new FileOutputStream("./myproject.xml")
					, "xml로 저장");	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
