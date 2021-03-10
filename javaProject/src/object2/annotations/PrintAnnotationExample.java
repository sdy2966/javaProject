package object2.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods();
		Constructor[] constructors = Service.class.getDeclaredConstructors();
		Field[] fields = Service.class.getDeclaredFields();

		// Method객체를 하나씩 처리
		for (Method method : methods) {
			// PrintAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation 객체받기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				// 구분선 출력
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					// 메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
				}
				System.out.println();
			}
		}

	}
}
