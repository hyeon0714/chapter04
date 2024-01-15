package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class PointApp {
	
	public static void main(String[] args) {
		
		Set<Point> sset=new HashSet<Point>();
		
		Point p01=new Point(2,2);
		Point p02=new Point(4,2);
		Point p03=new Point(2,2);
		Point p04=new Point(6,2);
		Point p05=p01;
		
		sset.add(p01);
		sset.add(p02);
		sset.add(p03);
		sset.add(p04);
		sset.add(p05);
		
		System.out.println(sset);
		
		for(Point p:sset) {//hashCode 수정후 변경상태 확인
			System.out.println(p.hashCode());
		}
		
		
	}
}
