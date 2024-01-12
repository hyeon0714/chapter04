package com.javaex.ex03;

public class MyListApp {
	
	public static void main(String[] args) {
		/*
		MyList<Point> pList=new MyList<Point>();
		
		Point p01=new Point(2,2);
		Point p02=new Point(5,5);
		Point p03=new Point(10,10);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		System.out.println(pList.toString());
		
		
		MyList<Circle> cList=new MyList<Circle>();
		
		Circle c01=new Circle(100);
		Circle c02=new Circle(200);
		
		cList.add(c01);
		cList.add(c02);
		System.out.println(cList.toString());
		*/
		
		MyList<Point> pList=new MyList<Point>();
		Point p01=new Point(2,2);
		Point p02=new Point(4,4);
		Point p03=new Point(3,3);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		System.out.println(pList.toString());
		
		MyList<Circle> cList=new MyList<Circle>();
		Circle c01=new Circle(50);
		Circle c02=new Circle(100);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(p03);//제너릭 사용으로 자료형을 전용으로 바꾼다
		System.out.println(cList.toString());
		
	}
}
