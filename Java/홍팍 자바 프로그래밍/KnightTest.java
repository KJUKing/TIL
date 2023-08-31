package juju0823;

public class KnightTest {
	  public static void main(String[] args) {
	    // 객체 생성
		Knight donkihote = new Knight("돈키호테", 30);
	    // 정보 출력
	    System.out.printf("[객체 생성]\n %s", donkihote.toString());
	    // 체력 증가: 기존 체력 + 30
	    donkihote.setHp(donkihote.getHp() + 30);
	    // 결과 출력
	    System.out.printf("[체력 증가 +30]\n %s", donkihote.toString());
	  }
	}

	class Knight {
	  // 필드
		private String name;
		private int hp;
	  // 생성자
		public Knight(String name, int hp){
			this.name = name;
			this.hp = hp;		
		}
		
	  // 게터
		public int getHp() {
			return this.hp;
		}
	  // 세터
		public void setHp(int hp) {
			this.hp = hp;
		}
	  // toString
		public String toString() {
		    return String.format("Knight { name: %s, hp: %d }\n", this.name, this.hp);	
		}
	}
