package juju0907;

public class ObjectGrouping {
	  public static void main(String[] args) {
	    // 다양한 객체 생성
	    Bird bird = new Bird("새");
	    Helicopter copter = new Helicopter("헬기");
	    Rocket rocket = new Rocket("로켓");
	    
	    // 인터페이스 타입으로 그룹화
	    Flyable[] flyableThings = { bird, copter, rocket };
	    
	    // 모든 날것들을 날림
	    for (int i = 0; i < flyableThings.length; i++) {
	      Flyable temp = flyableThings[i];
	      temp.fly();
	    }
	  }
	}
	
	
	interface Flyable {
	  public void fly();
	}

	class Bird implements Flyable {
		private String name;
		
		public Bird(String name) {
			this.name = name;
		}
	  /* 1. fly() 메소드를 오버라이딩 하세요. */
		public void fly() {
			System.out.printf("<%s>가 날개를 퍼덕이며 날아갑니다!\n", this.name);
		}
	}

	class Helicopter implements Flyable {
		private String name;
		
		public Helicopter(String name) {
			this.name = name;
		}
	  /* 2. fly() 메소드를 오버라이딩 하세요. */
		public void fly() {
			System.out.printf("<%s>가 프로펠러를 힘차게 돌리며 날아갑니다!\n", this.name);
		}
	}

	class Rocket implements Flyable {
		private String name;
		
		public Rocket(String name) {
			this.name = name;
		}
	  /* 3. fly() 메소드를 오버라이딩 하세요. */
		public void fly() {
			System.out.printf("<%s>이 제트 엔진을 분출하며 날아갑니다!\n", this.name);
		}
	}