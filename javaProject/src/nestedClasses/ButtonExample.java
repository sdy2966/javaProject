package nestedClasses;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();// Button.OnClick()- 메소드에 어떤 구현 객체가 들어오느냐에 따라 실행 결과값이 다름
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();// Button.OnClick()- 메소드에 어떤 구현 객체가 들어오느냐에 따라 실행 결과값이 다름

		//익명구현객체 써보기
	}

}
