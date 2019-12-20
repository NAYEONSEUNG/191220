package chapter12;

import java.util.HashMap;

public class HashMap01 {

		public static void main(String[] args) {
			
			HashMap<String,Object> map = new HashMap<>();//object썼단말은 어떤값을 받든다 받을수있다는 말.string은 key로받고 object는 value로받음
			map.put("선생님", "초롱");
			map.put("강아지","체리");//값넣을때 put이라고 한다. add라고 안하고 
			System.out.println(map.get("선생님")); //값을 요청할때 key가 필요하다.
			
		}
}
