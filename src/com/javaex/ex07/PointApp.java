package com.javaex.ex07;

import java.util.HashMap;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		HashMap<String, Point> hmap=new HashMap<String, Point>();//map은 키값을 기준으로 값을 정리해서 키값을 넣을 자료형이 필요하다
		
		Point p01=new Point(2,3);
		Point p02=new Point(4,6);
		Point p03=new Point(5,7);
		
		hmap.put("1번", p01);//map은 add가 아니고 put으로 입력한다
		hmap.put("2번", p02);//첫번째는 키가될 값을 두번째는 입력할 객체나 값을 입력한다
		hmap.put("3번", p03);
		

		
		System.out.println(hmap.size());
		System.out.println(hmap);//출력이 키와 실제 값이 출력된다
		System.out.println(hmap.get("1번").getX());//키를 통해 하나씩 출력하기
		
		
		Point p04=new Point(10,10);
		hmap.put("3번", p04);
		System.out.println(hmap);//중복이 없는 map은 같은 키값으로 입력될시 키의 값을 새로운 값으로 덮어쓴다 

		//키 관리하기
		Set<String> key = hmap.keySet();//Set의 중복값 정리를 통해 관리
		System.out.println(key);
		for(String a:key) {
			System.out.println(a);
		}
		
		
		
		//전체 출력하기
		for(String a:key) {
			System.out.println(hmap.get(a));
		}
		
	}

}
