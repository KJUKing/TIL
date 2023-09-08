package juju0907;

public class SmartPhoneTest2 {
	  public static void main(String[] args) {
	    // 객체 생성
		  SmartPhone Sp = new SmartPhone("갤럭시");
	    // 비프음 내기
		  Sp.beep();
	    // 음악 재생하기
		  Sp.playMusic("상어송");
	  }
	}

	interface Alarm {
	  public void beep();                  // 비프음
	  public void playMusic(String title); // 음악 재생
	}

	class SmartPhone implements Alarm {
	  private String name; // 모델명

	  public SmartPhone(String name) {
	    this.name = name;
	  }
	  /* Alarm 인터페이스의 추상 메소드를 재정의하시오. */
	  public void beep() {
		  System.out.println("삐빕! 삐비비빕~!");
	  }
	  
	  public void playMusic(String name) {
		  System.out.printf("[%s]을 재생합니다..!", name);
	  }
	}