package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {//T가 사용시에 해당 클래스로 바뀐다
	//제네릭: 사용할 타입을 외부(실제 사용할 클래스에서)에서 정한다
	
	
	private T[] oArray;
	private int crtPos;
	
	public MyList() {
		oArray=(T[])new Object[3];//배열의 제너릭 사용
		crtPos=0;
	}
	
	public void add(T o) {
		oArray[crtPos]=o;
		crtPos +=1;
	}
	
	public int size() {
		
		return crtPos;
	}
	
	public T get(int index) {
		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
