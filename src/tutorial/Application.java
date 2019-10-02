package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Application extends Frame implements WindowListener {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() 
	{
		super();
		
		Model modl = new Model();
		
		Controller ctrl = new Controller(modl); 
		
		View view = new View();
		
		modl.addObserver(view);
		
		view.addActionListener(ctrl);
		
		this.add(view);
		
		this.pack();
		this.setTitle("The clic game");
		this.setVisible(true);	
	}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}

}
