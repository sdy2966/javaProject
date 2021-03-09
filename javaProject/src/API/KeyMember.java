package API;

public class KeyMember {
	public String id;

	public KeyMember(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof KeyMember) { // https://improver.tistory.com/140
			KeyMember member = (KeyMember) obj;
			if (id.equals(member.id)) {
				return true;
			}

		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
//equals예제 연습p463
