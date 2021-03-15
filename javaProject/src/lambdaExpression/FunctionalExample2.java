package lambdaExpression;


@FunctionalInterface
interface MyFunctionInterface {
	void run(String str);
//	void method(); 메소드가 두개가 될수없다
}

public class FunctionalExample2 {
	public static void main(String[] args) {
//		MyFunctionInterface mfi = new MyFunctionInterface() {
//			@Override
//			public void run(String str) {
//				System.out.println(str + "을 실함니다");
//			}
//		};
		MyFunctionInterface mfi = (str) -> System.out.println(str + "을 실함니다");
		mfi.run("run()");
		mfi.run("call()");
	} 

}
