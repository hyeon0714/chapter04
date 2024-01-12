package com.javaex.ex02;

public class MyListApp {
	
	public static void main(String[] args) {
		
		MyList pList=new MyList();
		
		Point p01=new Point(2,2);
		Point p02=new Point(5,5);
		Point p03=new Point(10,10);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		System.out.println(pList.toString());
		
		
		MyList cList=new MyList();
		
		Circle c01=new Circle(100);
		Circle c02=new Circle(200);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(p02);//하나의 리스트로 관리해서 2개가 섞여서 사용
		System.out.println(cList.toString());
		
	}
}
