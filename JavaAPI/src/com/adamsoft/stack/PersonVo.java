package com.adamsoft.stack;

import java.util.Date;

/*
 * 여러개의 값을 묶어서 표현하기 위한 클래스 - value Object(VO)
 * getter와 constructor는 만들지만 setter는 만들지 않는 경우가 많음
 */

public class PersonVo {

	private String name;
	private Date birthday;
	private String phone;
	private long num;
	
	//매개변수가 없는 생성자 - default constructor
	//NoArgsConstructor
	public PersonVo() {
		super();
	}

	//AllArgsConstructor
	public PersonVo(String name, Date birthday, String phone, long num) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
		this.num = num;
	}
		
	//Getter
	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	public long getNum() {
		return num;
	}

	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발과정 중 값을 확인하기 위한 목적
	@Override
	public String toString() {
		return "PersonVo [name=" + name + ", birthday=" + birthday + ", phone=" + phone + ", num=" + num + "]";
	}
	
	
	
	
}
