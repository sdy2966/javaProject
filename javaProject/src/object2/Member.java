package object2;

public class Member {
	private String memberId;
	private String memberName;
	private Boook[] rentBooks = new Boook[5];
	public Member() {}

	public Member(String memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void rent(Boook book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Boook book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null && rentBooks[i].getBookTitle().equals(book.getBookTitle())) {
				rentBooks[i] = null;
				break;
			}
		}
	}
//->
	public void getBookInfo() {
		System.out.print(getMemberId() + " - ");
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				System.out.print(rentBooks[i].getBookTitle() + " / ");
			}
		}
		System.out.println();
//=		
//	public void getBookInfo() {
//		String result = "";
//		result = memberNmae;
//		for (int i = 0; i < rentBooks.length; i++) {
//			if(	rentBooks[i] != null) {
//			result = result + "/" + rentBooks[i].getBookTitle();
//				return result;
//			}
//		} 
//<-
		
	}
}
