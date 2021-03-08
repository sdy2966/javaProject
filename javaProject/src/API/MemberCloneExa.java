package API;

public class MemberCloneExa {
	public static void main(String[] args) {
		Member original = new Member("blue", "홍길이", "12344", 25, true);//원본 객체 생성
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "64536";
				
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+ cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age:" + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+ original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age:" + original.age);
		System.out.println("adult: " + original.adult);
		
	}

}
