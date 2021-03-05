package inheritances;

public class cellPhoneEx2 {
	public static void main(String[] args) {
		Cellphone cp = new Cellphone();
//		cp = (Cellphone) new DmbPhone();//int = (int//자식 클래스 인스턴스는 자동으로 따로 명시하지 않아도 부모 인스턴스에 명시된다???형변환된다? 반대로는 어렵
//		cp = (Cellphone) new SmartPhone();
		cp = new DmbPhone();
		cp.color = "";

		if(cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp;
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();

		} else {
			System.out.println("Casting할 수 없음");//부모자식캐스팅
		}
		//다형성.
		//부모=자식들
		//부모, 메소드 = 자식. 메소드;
		//호출 코드가 같지만 어떤 인스턴스가 담기느냐에 따라 실행되는 결과를 달리 하겠다.
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}

}
