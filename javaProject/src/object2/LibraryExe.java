package object2;

public class LibraryExe {
	public static void main(String[] args) {
		Boook book1 = new Boook("ÀÌ°ÍÀÌ ÀÚ¹Ù´Ù","±è±è", "ÇÑºû",1000);
		System.out.println(book1);//µ¥ÀÌÅÍ À§Ä¡
		Boook book2 = new Boook("ÀÌ°ÅÀÌ ÀÚ¹Ù°¡","¹Ú¹Ú", "¿£¾¾",2000);
		Boook book3 = new Boook("ÀÌ°Å½¼ ÀÚ¹Ù´Ù","ÀÌÀÌ", "¼­¿ï¹®È­»ç",4000);
		Boook book4 = new Boook("µð½ºÀÌÁî ÀÚ¹Ù´Ù","ÃÖÃÖ", "½Ã³ª°ø",5000);
		Boook book5 = new Boook("¸Þ¶Ë°×","±è¿ø±â", "³Ø½¼",3000);
		
		Member mem1 = new Member("s111", "±è¹ÎÁÖ");
		mem1.rent(book1);
		Member mem2 = new Member("a222", "¹Ú¼Ò¿¬");
		mem2.rent(book2);
		mem2.rent(book5);
		//->
		mem2.overdue(book5);
		//=
		//String str = mem2.getBookInfo();
		//System.out.println(str);
		//<-
		mem2.getBookInfo(); //¸â¹öÀÌ¸§ - ³Ø½¼
		
		Member mem3 = new Member("f333", "±è´ÙÈñ");
		mem3.rent(book4);
		mem3.getBookInfo(); //¸â¹öÀÌ¸§ - ½Ã³ª°ø
		
		
		
	}
	 
}
