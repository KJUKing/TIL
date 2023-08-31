package juju0828;
import java.util.ArrayList;

public class ArrayListTest {
	  public static void main(String[] args) {
	    /* 2. String을 담을 수 있는 리스트 객체를 만드시오. */
	    ArrayList<String> list = new ArrayList<String>();
	    
	    /* 3. 리스트에 이름을 추가하시오. */
	    list.add("Kim");
	    list.add("Lee");
	    list.add("Park");
	    list.add("Choi");
	    list.add("Hong");
	    list.add("No");
	    
	    /* 4. 반복문을 통해 모든 이름을 출력하시오. */
	    for (int i = 0; i < list.size(); i++) {
	      String name = list.get(i); // i번째 인덱스 값을 가져옴
	      System.out.printf("list.get(%d) -> %s\n", i, name);
	    }
	  }
	}

//변수명 일괄변경 alt shift r
