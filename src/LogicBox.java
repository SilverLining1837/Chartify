import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public abstract class LogicBox {
	
	protected ImageIcon icon;
	

	public LogicBox() {
		
	}
	
	protected abstract JFrame popUp();
	protected abstract File write();

}
