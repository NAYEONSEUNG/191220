package chapter09;
//추상클래스를 상속받는 자식 클래스
public class Dog extends Animal{
	public Dog() {
		this.kind = "강아지";//카인드에 강아지넣었음 디스는 나 자신을 뜻함
				
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
