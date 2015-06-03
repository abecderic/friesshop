package abec.friesshop;

import javax.swing.JFrame;

import abec.friesshop.gui.Gui;

public class Start
{
	public static void main(String[] args)
	{
		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(800, 450);
		gui.setResizable(false);
		gui.setVisible(true);
	}
}
