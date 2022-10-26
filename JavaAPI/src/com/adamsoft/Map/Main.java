package com.adamsoft.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//HashMap인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		//Map에 데이터 저장 - put
		map.put("a", 1);
		map.put("b", "wow");
		map.put("c", "cow");
		//Key에 동일한 값이 저장되면 이전데이터 삭제 -> 수정 / 한개 이상의 값은 저장이 안됌
		map.put("c", "corn");
		
		//전체 데이터 확인
		System.out.println(map);
		
		//Map에서 데이터 가져오기
		System.out.println(map.get("a"));
		//Key가 없으면 null
		System.out.println(map.get("d"));
		//key의 value 삭제
		System.out.println(map.remove("b"));
		
		//Map을 이용하면 key의 이름을 몰라도 모든 데이터접근가능 : KeySet
		
		//모든 Key에 접근할 수 있는 set 가져오기
		Set<String> keys = map.keySet();
		
		//Set을 순회
		for(String key : keys) {
			//key를 순회하면서 key에 저장된 value를 확인
			System.out.println(key + ":" + map.get(key));
		}
	
	}
}
