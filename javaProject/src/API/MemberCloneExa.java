<<<<<<< HEAD
package API;

public class MemberCloneExa {
	public static void main(String[] args) {
		Member original = new Member("blue", "í™ê¸¸ì´", "12344", 25, true);//ì›ë³¸ ê°ì²´ ìƒì„±
		
		//ë³µì œ ê°ì²´ë¥¼ ì–»ì€ í›„ì— íŒ¨ìŠ¤ì›Œë“œ ë³€ê²½
		Member cloned = original.getMember();
		cloned.password = "64536";
				
		System.out.println("[ë³µì œ ê°ì²´ì˜ í•„ë“œê°’]");
		System.out.println("id: "+ cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age:" + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[ë³µì œ ê°ì²´ì˜ í•„ë“œê°’]");
		System.out.println("id: "+ original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age:" + original.age);
		System.out.println("adult: " + original.adult);
		
	}

}
=======
package API;

public class MemberCloneExa {
	public static void main(String[] args) {
		Member original = new Member("blue", "È«±æÀÌ", "12344", 25, true);//¿øº» °´Ã¼ »ý¼º
		
		//º¹Á¦ °´Ã¼¸¦ ¾òÀº ÈÄ¿¡ ÆÐ½º¿öµå º¯°æ
		Member cloned = original.getMember();
		cloned.password = "64536";
				
		System.out.println("[º¹Á¦ °´Ã¼ÀÇ ÇÊµå°ª]");
		System.out.println("id: "+ cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age:" + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[º¹Á¦ °´Ã¼ÀÇ ÇÊµå°ª]");
		System.out.println("id: "+ original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age:" + original.age);
		System.out.println("adult: " + original.adult);
		
	}

}
>>>>>>> branch 'master' of https://github.com/sdy2966/javaProject.git
