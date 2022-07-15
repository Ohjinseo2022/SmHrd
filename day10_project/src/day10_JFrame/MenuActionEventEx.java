package day10_JFrame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuActionEventEx extends JFrame {
	
	private JLabel imgLabel = new JLabel();
	public MenuActionEventEx() {
		setTitle("Menu에 Action리스너 만들기 예제");
		createMenu();
		getContentPane().add(imgLabel,BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	private void createMenu() {
		
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Load","Hide","ReShow","Exit"};
		JMenu screenMenu = new JMenu("Screen");
		//4개의 메뉴아이템을 Screen메뉴에 삽입한다.
		MenuActionListener listener = new MenuActionListener();
		for(int i =0;i<menuItem.length;i++) {
			menuItem[i]=new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String path = "C:\\Users\\user\\eclipse-workspace\\day10_project\\src\\day10_JFrame\\images\\";
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "Load":
				if(imgLabel.getIcon() != null) {
					return;
				}
				imgLabel.setIcon(new ImageIcon(path+"pear.jpg"));
				break;
			case "Hide":
				imgLabel.setIcon(new ImageIcon(path+"banana.jpg"));
				break;
			case "ReShow":
				imgLabel.setIcon(new ImageIcon(path+"mango.jpg"));
				break;
			case "Exit":
				imgLabel.setIcon(new ImageIcon(path+"apple.jpg"));
				break;
			}
		}

		
	}
	public static void main(String[] args) {
		new MenuActionEventEx();
	}
}
