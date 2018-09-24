import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

class ExitListener extends WindowAdapter {
	
	public void closing(WindowEvent event)
	{
		System.exit(0);
	}
}