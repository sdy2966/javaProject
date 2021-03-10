package nestedClasses;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listerner) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
//402p