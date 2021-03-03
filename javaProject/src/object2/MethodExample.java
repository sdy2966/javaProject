package object2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {
		 for (int i = 0; i<args.length; i++) {
			 System.out.println("매개값[" + i + "]: " + args[i]);
		 }
		 
		
		Calculator cal = new Calculator(); //
		double result = cal.getArea(3.5);
		Calculator.getRect(4.5, 2);//static
	
		
		Boook b1 = new Boook("","","",100);//
		Student s1 = new Student();
		s1.study();
		s1.run();
	}
	
}
//public 접근수준
//static 생성
//void
//