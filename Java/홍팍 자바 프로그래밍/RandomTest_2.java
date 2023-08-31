package juju0828;

import java.lang.Math;
import java.util.Random;

public class RandomTest_2 {
	  public static void main(String[] args) {
	    // 변수 생성 및 주사위 던지기
	    int sum;
	    int[] count = new int[13];
	    
	    for(int i=1; i<=100; i++) {
		    int a = Die_A.roll();
		    int b = Die_B.roll();
		    //나중에 알게됐지만 sum을 만들필요없고 count[a+b] 이렇게 바로 대입해도된다.
	    	sum = a + b;
	    	//count[sum]++ 이뜻은 0부터 숫자이므로 +1을 하는의미 0 -> 1
	    	count[sum]++;
	    	//count[sum]+= 1; 이렇게 해도 문제는 없다.
	    }
//        for (int i = 2; i < count.length; i++) {
//            System.out.printf("%d => %d\n", i, count[i]);
//          }
	    // i는 count를 탐색하기 위해 해당 루프의 현재 위치를 표시한 값이다.
	    // count.length 대신 애초에 a+b최대크기인 12의 값을 넣어도된다. 즉 배열의 크기값을 넣어도 문제없음
	    // for( int i = 2; i < 13; i++) 이런식으로
	    for( int i = 2; i < count.length; i++) {
	    	System.out.printf("%d => ", i);
	        // 결국 2중for문에있는 j의 값은 count[i]의 값에 의해 움직인다
	    	// 여기서 헤맸는데 결국 j는 count[i]의 숫자만큼 #을 출력해야한다
	    	// 말그대로 2의 카운트가 4번이면 4번의 #을 출력하는것이다.
	    	// j의 for문이 끝나면 2에서 3으로 넘어가고 12까지 이어지는형식.
	    	for (int j = 0; j < count[i]; j++) {
	           System.out.print("#");
	        }
	    System.out.println();
	    // 결과 출력
//	    System.out.printf("A: %d\n", a);
//	    System.out.printf("B: %d\n", b);
	  }
	}
}

class Die_A {
	  public static int roll() {
	    double r = Math.random() * 6; // 0.0 <= r < 6.0
	    int randInt = (int) r;        // 0, 1, 2, ..., 5
	    return randInt + 1;				  // 1, 2, 3, ..., 6
	  }
	}

	class Die_B {
	  public static int roll() {
	    Random rand = new Random();
	    int randInt = rand.nextInt(6); // (0 ~ 5)
	    return randInt + 1;
	  }
	}