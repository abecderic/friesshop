package abec.friesshop.gui;

import javax.swing.JFrame;

public class Gui extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private Panel panel;
	
	public Gui()
	{
		super("FrittenBude");
		
		panel = new Panel();
		panel.setSize(800, 450);
		add(panel);
	}
}
