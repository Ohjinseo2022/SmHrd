package day10_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboActionEx extends JFrame{
	private String[] frutis = {"apple","banana","mango"};
	private String path = "C:\\Users\\user\\eclipse-workspace\\day10_project\\src\\day10_JFrame\\images\\";
	private ImageIcon[] images = {new ImageIcon(path+"apple.jpg"),
			new ImageIcon(path+"banana.jpg"),
			new ImageIcon(path+"kiwi.jpg"),
			new ImageIcon(path+"mango.jpg")
	};
	
			
	private JLabel imgLabel = new JLabel(images[0]);
	private JLabel frut = new JLabel(frutis[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(frutis);
	
	public ComboActionEx() {
		setTitle("콤보박스 활용예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}
}
