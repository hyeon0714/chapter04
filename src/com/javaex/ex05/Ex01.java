package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//섞어쓰기로 hastset와 treeset의 호환성을 높일수있다
		 Set<Integer> iSet=new HashSet<Integer>();//제너릭에서는 기본자료형을 안쓴다->wrapping 클래스 부르기
		 
		 Integer i01=new Integer(3);
		 Integer i02=new Integer(6);
		 Integer i03=new Integer(9);
		 Integer i04=new Integer(6);
		 
		 iSet.add(i01);//int가 아닌 Integer가 제너릭이라서 Integer를 이용한 주소값을 넣어야한다
		 iSet.add(i02);
		 iSet.add(i03);
		 iSet.add(i04);//-> set은 중복을 적용을 안한다
		 // ->>>중복적용이 안되기에 추가한 값은 같은 값과 합쳐져서 표시가 안된다
		 
		 System.out.println(iSet.size());
		 System.out.println(iSet);
		 
		 for(int i=0; i<iSet.size(); i++) {
			 //iSet[i];   -> set은 순서가 정하지 않기 때문에 순서를 통해 for문으로 출력할수 없다 
			 //System.out.println(iSet);
		 }
		 
		 for(Integer a : iSet) {//향상된 for문 ->>>  Integer 변수라는 값을 iSet이라는 범위에서 출력한다
			 System.out.println(a.toString());
		 }
		 
		 Integer i05=100;
		 iSet.add(i05);
		 for(Integer b:iSet) {
			 System.out.println(b.toString());
		 }
		 
		 System.out.println("=================");//set의 중복제거를 통한 로또 번호 구하기
		 
		 Set<Integer> iset=new HashSet<Integer>();
		 
		 Integer[] c=new Integer[6];
		 int[] d=new int[6];
		 
		 for(int i=0; i<c.length; i++) {
			 d[i]=(int)(Math.random()*45)+1;
			 c[i]=d[i];
		 }
		 
		 iset.add(d[0]);
		 iset.add(d[1]);
		 iset.add(d[2]);
		 iset.add(d[3]);
		 iset.add(d[4]);
		 iset.add(d[5]);
		 
		 System.out.println(iset);
		 
		 
		 System.out.println("===================");//set의 중복제거를 통한 로또 번호 구하기(6개를 구하게하기)
		 Set<Integer> set=new HashSet<Integer>();
		 
		 while(true) {
			 if(set.size()>=6) {
				 break;
			 }int no=(int)(Math.random()*45)+1;
			 set.add(no);
		 }
		 for(Integer k:set) {
			 System.out.println(k.toString());
		 }
		 
	}
}
