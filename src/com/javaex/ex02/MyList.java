package com.javaex.ex02;

import java.util.Arrays;

public class MyList {
	
	private Object[] oArray;
	private int crtPos;
	
	public MyList() {
		oArray=new Object[3];
		crtPos=0;
	}
	
	public void add(Object o) {
		oArray[crtPos]=o;
		crtPos +=1;
	}
	
	public int size() {
		
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
