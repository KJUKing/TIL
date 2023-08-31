package juju0828;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class SimpleLottoMachine {
  public static void main(String[] args) {
    // 1 ~ 45개의 숫자 생성
    ArrayList<Integer> list = new ArrayList<Integer>();
    // ArrayList의 값을 추가하기
    list.add(1);
    for( int i= 0; i < 46; i++ ) {
    	list.add(i);
    	System.out.printf("%d", list.get(i));
    }
    // 섞는다
    Collections.shuffle(list);
    // 뽑는다
    int[] pick = new int[6];
    
    for(int i = 0; i<6; i++) {
    	pick[i] = list.get(i);
    }
    // 결과 출력
    System.out.printf("자동 생성 번호: %s", Arrays.toString(pick));
  }
}


