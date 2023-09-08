package juju0907;

import java.util.ArrayList;


public class InterfaceReview {
	
	  public static void main(String[] args) {
	    // 객체 생성
		  Dog d = new Dog("Dog");
		  Baby b = new Baby("Baby");
		  Tiger t = new Tiger("Tiger");
		  Robot r = new Robot("Robot");
		// 인터페이스 배열 생성
		  ArrrayList<Sounding> list = new ArrayList<Sounding>();

		  list.add(d);
		  list.add(b);
		  list.add(t);
		  list.add(r);
	    // 소리내기
		    for (int i = 0; i < list.length; i++) {
			      Sounding temp = list[i];
			      temp.sound();
	  }
	}
}
	/* 인터페이스 및 클래스를 작성하시오. */
	interface Sounding{
		public void sound();
	}
	
	class Dog implements Sounding {
		private String name;
		
		public Dog(String name) {
			this.name = name;
		}
		
		public void sound() {
			System.out.printf("%s: 멍멍!", this.name);
		}
	}
	
	class Baby implements Sounding {
		private String name;
		
		public Baby(String name) {
			this.name = name;
		}
		
		public void sound() {
			System.out.printf("%s: 응애!", this.name);
		}
	}
	
	class Tiger implements Sounding {
		private String name;
		
		public Tiger(String name) {
			this.name = name;
		}
		
		public void sound() {
			System.out.printf("%s: 어흥!", this.name);
		}
	}
	
	class Robot implements Sounding {
		private String name;
		
		public Robot(String name) {
			this.name = name;
		}
		
		public void sound() {
			System.out.printf("%s: 삐빕!", this.name);
		}
	}
