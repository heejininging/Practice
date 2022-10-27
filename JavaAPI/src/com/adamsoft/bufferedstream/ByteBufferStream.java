package com.adamsoft.bufferedstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteBufferStream {

	public static void main(String[] args) {
		try {
			//버퍼를 이용해서 출력하는 스트림 만들기
			PrintStream ps = new PrintStream(
					new FileOutputStream("./buffer.txt"));
			ps.print("문자열을 이용해서 버퍼 출력");
			ps.flush();//버퍼의 내용을 출력
			ps.close();//닫기
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
