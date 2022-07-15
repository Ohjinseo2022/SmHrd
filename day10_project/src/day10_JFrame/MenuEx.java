package day10_JFrame;

import javax.swing.*;

public class MenuEx extends JFrame{
	public MenuEx() {
		setTitle("Menu 만들기 예제");
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		screenMenu.add(new JMenuItem("laod"));
		
		
	}
}
