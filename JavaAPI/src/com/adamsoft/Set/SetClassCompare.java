package com.adamsoft.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {

	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스 3개 생성
		Set<String> hashset = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		hashset.add("자바");
		linkedHashSet.add("자바");
		treeSet.add("자바");
		
		hashset.add("파이썬");
		linkedHashSet.add("파이썬");
		treeSet.add("파이썬");
		
		hashset.add("C");
		linkedHashSet.add("C");
		treeSet.add("C");
		
		hashset.add("리눅스");
		linkedHashSet.add("리눅스");
		treeSet.add("리눅스");
		
		//데이터 출력
		//HashSet : 출력기준이 없음
		for(String lang : hashset) {
			System.out.println(lang + "\t");
			/*
			 * C	
				리눅스	
				파이썬	
				자바
			 */
		}
		System.out.println();
		
		//LinkedHashSet : 값을 저장한 순서대로 출력
		for(String lang : linkedHashSet) {
			System.out.println(lang + "\t");
			/*
			 * 자바	
				파이썬	
				C	
				리눅스
			 */
		}
		System.out.println();

		//TreeSet : 정렬된 순서대로 출력
		for(String lang : treeSet) {
			System.out.println(lang + "\t");
			/*
			 * C	
				리눅스	
				자바	
				파이썬
			 */
		}
		System.out.println();

		
		
		
		
	}
	
}
