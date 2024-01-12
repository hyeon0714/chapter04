package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	// 필드
	private Point[] pArray;
	private int crtPos;

	// 생성자
	public PointList() {
		// 원래만들지않음 편의상 가정
		pArray = new Point[3];
		crtPos = 0;
	}

	// 메소드 gs

	// 매소드 일반
	public void add(Point p) {
		// 현재배열개수+1 배열을 새로 만든다
		// 이전배열의 값을 새배열에 옮긴다
		// 마지막방에 새주소를 추가한다
		pArray[crtPos] = p;
		// crtPos = crtPos + 1;
		crtPos += 1;
	}

	public int size() {

		return crtPos;
	}

	public Point get(int index) {

		return pArray[index];
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}

}
