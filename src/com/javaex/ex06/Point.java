package com.javaex.ex06;

import java.util.Objects;

public class Point{
	//필드
	private int x;
	private int y;

	//생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);//원래는 x+y+소수로 구성된다->소수를 없앰으로 같은 값은 중복처리
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//클래스의 이름비교
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	/*
	boolean result;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point p=(Point)obj;
		if(this.x==p.x && this.y==p.y) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result=x+y;
		
		return result;
	}
	//set의 객체 중복 검사중에 같은값을 중복처리하려면 equals만 수정할게 아니라 HashCode도 수정해줘야한다
	//set의 검사 순서는 HashCode -> equals 순으로 검사한다
	*/
	
	
	
	
	
}
