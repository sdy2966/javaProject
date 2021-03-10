package threads;

import java.awt.Toolkit;

public class BeepTask {
 Toolkit toolkit = Toolkit.getDefaultToolkit()
		 for(int i=0; i<5; i++) {
			 toolkit.beep();
			 try { Thread.sleep(500);}
		 }
}
