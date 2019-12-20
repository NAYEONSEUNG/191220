package chapter08;

//자식클래스
//:JAVA는 단일상속만 가능!
public class DmbCellPhone extends CellPhone{
	 int channel;
	 
	
	 public DmbCellPhone(String model, String color, int channel) {
		 
		 //supuer(); => 부모생성자 호출(부모객체 생성)
		 //부모객체생성 후 자식객체가 생성됨!!
		 super();//== CellPhone();  super을 한줄만 내려도 에러가뜬다.          생략가능           CellPhone();생성자메서드 
		 this.model = model;
		 this.color = color;
		 this.channel = channel;
		 
	 }
	 
	 public void turnOnDmb() {
		 System.out.println("채널"+ channel +"번 dmb 방송 수신을 시작합니다");
	 }
	 
	 public void ChangeChannelDmb(int channel) {
		 this.channel = channel;
		 System.out.println("채널" + channel + "번으로 변경합니다.");
	 }
	 
	 public void turnOffDmb() {
		 System.out.println("dmb 방송 수신을 멈춥니다");
	 }
	 
}//클래스
