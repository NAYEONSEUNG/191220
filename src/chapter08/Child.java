package chapter08;

//자식class
public class Child extends Parent {
   

		
	@Override//어노테이션 자바가 실행할 때 표지판같은 개념
	public int sum(int a, int b) {
		super.sum(2, 3); //부모의 sum()메서드
		System.out.println("합:" + (a+b));
		return super.sum(a, b);
		
	}//int sum	
	
	//메서드 재정의(오버라이딩)
	//: 부모클래스의 메서드를 그대로 사용하는게 아니고
	// 내입맛에 맞게 바꾸어 사용하는 것!
	
	
}//class
