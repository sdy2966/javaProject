package lambdaExpression;
//p679
interface MyFunctionalInterface {
	void run();// 구현해야할 메소드가 '하나만' 있는 인터페이스: FunctionalInterface
}

class MyFunctionClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("run을 실행");

	}
}

public class FunctionalExample {
	public static void main(String[] args) {
//		MyFunctionalInterface mif = new MyfunctionCalss();
		MyFunctionalInterface mif = new MyFunctionalInterface() {
			@Override
			public void run() {
				System.out.println("run()를 실행");		
			}	
		};
		mif.run();	
//		mif = new MyFunctionalInterface() {
//		@Override
//		public void run() {
//			System.out.println("run() 메소드를 실행");
//		}	
//	}; 를
		mif = () -> System.out.println("run() 메소드를 실행"); // 익명성??을 주고싶다?? 화살표로 매개값을 ??해서 간단하게 람다표현식으로 인터페이스객체를 구현하겠다
				
		mif.run();

	}

}
