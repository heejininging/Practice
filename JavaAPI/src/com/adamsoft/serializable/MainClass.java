package com.adamsoft.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		try {
			//인스턴스 단위로 파일에 기록할 수 있는 객체 생성
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("serializable.txt"));
			
			//기록할 인스턴스 생성
			ComputerDTO dto = new ComputerDTO("samsung", 100, new Date());
			
			//기록
			oos.writeObject(dto);
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			ObjectInputStream ios = new ObjectInputStream(
					new FileInputStream("serializable.txt"));
			//하나의 데이터 읽어오기
			ComputerDTO dto = (ComputerDTO)ios.readObject();
			System.out.println(dto);
			ios.close();
					
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
