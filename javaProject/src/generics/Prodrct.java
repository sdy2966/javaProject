package generics;

public class Prodrct<T, M> {
	T kind;// 필드선언
	M model;

	public void setKind(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setmodel(M model) {
		this.model = model;

	}

	public M getModel() {
		return model;
	}
}
