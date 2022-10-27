package com.adamsoft.serializable;

import java.io.Serializable;
import java.util.Date;

//인스턴스 단위로 읽고쓰기 가능한 클래스 - Serializable(직렬화) 인터페이스 때문에
public class ComputerDTO implements Serializable{

	
		private String brand;
		private int price;
		private Date made;
		
		public ComputerDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ComputerDTO(String brand, int price, Date made) {
			super();
			this.brand = brand;
			this.price = price;
			this.made = made;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Date getMade() {
			return made;
		}

		public void setMade(Date made) {
			this.made = made;
		}

		@Override
		public String toString() {
			return "ComputerDTO [brand=" + brand + ", price=" + price + ", made=" + made + "]";
		}
		
		
		
		
		
	
}
