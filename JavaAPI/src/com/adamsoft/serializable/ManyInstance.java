package com.adamsoft.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class ManyInstance {
	public static void main(String[] args) {
		try (//인스턴스 단위로 파일에 기록할 수 있는 객체 생성
				ObjectOutputStream oos = new ObjectOutputStream(
						new FileOutputStream("multiObject.txt"));) {

			//기록할 인스턴스 생성
			ComputerDTO dto = new ComputerDTO("samsung", 100, new Date());
			ComputerDTO dto2 = new ComputerDTO("LG", 200, new Date());

			//기록할 인스턴스가 여러개이므로 하나의 List로 묶어준다.
			ArrayList<ComputerDTO> list =
					new ArrayList<>();
			list.add(dto);
			list.add(dto2);

			//기록
			oos.writeObject(list);

			oos.close();

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		try {
			ObjectInputStream ios = new ObjectInputStream(
					new FileInputStream("multiObject.txt"));
			//하나의 데이터 읽어오기
			ArrayList list= (ArrayList)ios.readObject();

			for(Object ob : list) {
				System.out.println(ob);
			}
			ios.close();


		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}


