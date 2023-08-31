package juju0828;

//자바 API를 불러옴
import java.lang.Math;
import java.util.Random;

public class RandomTest {
public static void main(String[] args) {
 // 변수 생성 및 주사위 던지기
 int a = DieA.roll();
 int b = DieB.roll();
 
 // 결과 출력
 System.out.printf("A: %d\n", a);
 System.out.printf("B: %d\n", b);
}
}

class DieA {
// 1 부터 6사이 정수를 반환
public static int roll() {
 double r = Math.random() * 6; // 0.0 <= r < 6.0
 // 0부터 5.9까지의 실수중에서 하나가나옴 1.3, 4.7 등등
 int randInt = (int) r;        // 0, 1, 2, ..., 5
 // (int)r로인해 정수로 캐스팅된다(변환) 1.3 -> 1, 4.7 -> 4 이걸 randInt에 저장
 return randInt + 1;           // 1, 2, 3, ..., 6
 // 1더하기 한 값을 리턴함 1+1 = 2 / 4+1 = 5
}
}

class DieB {
public static int roll() {
 /* Random 클래스를 활용하여 주사위의 눈값(1 ~ 6)을 반환하시오.*/
	Random rand = new Random();
	int randInt = rand.nextInt(6);
	return randInt + 1;
}
}
