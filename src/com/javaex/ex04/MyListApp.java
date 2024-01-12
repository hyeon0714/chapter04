package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListApp {
	
	public static void main(String[] args) {
		
		//add(), size(), get(), remove()
		//ArrayList<Point> pList=new ArrayList<Point>();
		//LinkedList<Point> pList=new LinkedList<Point>();//=>특수한 별도의 메소드를 사용하지 않으면 ArrayList와 LinkedList는 호환이 가능
		//List<Point> pList=new ArrayList<Point>();
		List<Point> pList=new LinkedList<Point>();//=>특수한 별도의 메소드를 사용못하게 처음부터 'List'를 기준으로 지정!
		//ArrayList와 LinkedList의 장점을 뽑아서 활용할수 있다(List 사용시)//단점은 별도의 메소드 사용 불가
		
		Point p01 =new Point(2,3);
		Point p02 =new Point(4,6);
		Point p03 =new Point(6,8);
		
		Circle c01=new Circle(45);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p01);
		//pList.add(c01);->>  <Point>로 제너릭을 줘서 pList에는 Circle이 올수 없다
		
		System.out.println(pList.size());
		System.out.println(p01.getY());
		
		//리스트 통해서 y값 
		System.out.println(pList.get(0).getY());//pList의 0번째 y값
		
		//전체출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		pList.remove(0);//리스트 제거(순번제거)
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println("----------");
		
		pList.remove(p02);//리스트 제거(특정 위치 제거)
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(pList.toString());
		
		System.out.println("=========================");
		System.out.println("=========================");
		
		List<Integer> iList = new ArrayList<Integer>();//-> 추상클래스(프레임웍은 사용할 클래스를 만들어줘야하지만
		//추상클래스는 항상 존재하기에 바로 사용가능
		
		Integer i01=new Integer(3);
		Integer i02=new Integer(6);
		Integer i03=new Integer(9);
		int i04=new Integer(12);//언박싱은 사용이 불가능하다
		
		iList.add(i01);
		iList.add(i02);
		iList.add(i03);
		System.out.println(iList.toString());
	}
}
