package chapter12;

import java.util.ArrayList;

public class ArrayList01 {
	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>();
		list.add("수박"	);//값 입력   0번자리
		list.add("바나나");//값 입력  1번자리
		list.add("포도"	);//값 입력   2번자리  add는 값을 넣어라, 넣고 옆으로 한칸식 밀어브러
		list.add(1,"망고");//(index,value)를 넣은것.index값 있어도 그만 없어도 그만
		list.set(3, "오렌지");//포도가 오렌지로 바뀐것, 3번자리, 값을 수정한다.index값이 필요
		list.remove(3);//값을 제거
		
		int[] array = new int[5];
		array[0] = 3;
		
		//출력
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));// get은 값을 꺼내와라, 망고꺼내주세요 하면 안꺼내준다. 반드시 index값으로 꺼내오라고 해야한다. index값?
		//	System.out.println(array[i]);//위에랑 동작하는건 똑같다
		}
		
		for(String val : list) { //향상된 포문 포이치문, 전체 다 출력할때만 사용한다.list안에 여러건있고 한건씩 꺼내쓴다.
			System.out.println(val); 
		}
		
   }//메인
}//클라스
