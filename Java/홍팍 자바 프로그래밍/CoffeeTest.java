package juju0823;

public class CoffeeTest {
	  public static void main(String[] args) {
	    // 커피 객체 생성
	    Coffee americano = new Coffee("아메리카노", 1500);
	    System.out.printf("커피값 인상 전 => %s\n", americano.toString());
	    
	    // 커피 값 인상: 1500 -> 1800
	    americano.setPrice(1800);
	    System.out.printf("커피값 인상 후 => %s\n", americano.toString());
	  }
	}

	class Coffee {
	  // 필드(인스턴스 변수)
	  private String name;
	  private int price;
	  
	  // 생성자
	  public Coffee(String name, int price) {
	    /* 1. this 키워드를 사용하여 필드를 초기화하세요.*/
		  //주체 객체를 가르킨것이므로 americano의 name과 price가 선언된것
	    this.name = name;
	    this.price = price;
	  }
	  
	  // 세터
	  public void setPrice(int price) {
	    /* 2. this 키워드를 사용하여 필드를 변경하세요.*/
	    this.price = price;
	  }
	  
	  // 메소드
	  public String toString() {
	    return String.format("Coffee { name: %s, price: %d }", name, price);
	  }
	}