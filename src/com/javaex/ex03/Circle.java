package com.javaex.ex03;

public class Circle {

	// 필드
	private int radius;

	// 생성자
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	// 메소드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
