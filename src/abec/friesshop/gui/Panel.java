package abec.friesshop.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawRect(40, 40, 80, 70);
	}
}
