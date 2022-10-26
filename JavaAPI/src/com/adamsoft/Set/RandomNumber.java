package com.adamsoft.Set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class RandomNumber {

	public static void main(String[] args) {
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random ran = new Random();
		
		//ArrayList활용
		ArrayList<Integer> al = new ArrayList<>();
		
		//ArrayList의 사이즈가 6보다 작을때까지
		while(al.size() < 6) {
			//1~45의 숫자 랜덤 추출
			int su = ran.nextInt(45) + 1;
			//중복검사를 해서 통과하면 add하고 통과하지못하면 수행하지 않음
			if(al.contains(su)) {
				continue;
			}
			al.add(su);
		}
			//출력하기 전에 숫자 정렬
			al.sort(null);
			System.out.println(al);
			
		//TreeSet : 중복된 데이터를 저장하지 않고 저장된 순서기억
		TreeSet<Integer> tree = new TreeSet<>();
		while(tree.size() < 6) {
			int su = ran.nextInt(45) + 1;
			//TreeSet은 중복된 값을 저장하지 않기때문에 검사x
			tree.add(su);
		}
	
		for(Integer i : tree) {
			System.out.println(i +"\t");
		}
	
	}
}
