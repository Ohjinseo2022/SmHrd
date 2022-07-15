package day10_JFrame;

import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame{
	private Container contentPane;
	public ToolBarEx() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void createToolBar() {
		String path = "C:\\Users\\user\\eclipse-workspace\\day10_project\\src\\day10_JFrame\\images\\";
		JToolBar bar = new JToolBar("Kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일을 생성합니다.");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon(path+"icon1.jpg"));
		openBtn.setToolTipText("파일을 엽니다.");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon(path+"icon2.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다.");
		bar.add(saveBtn);
		
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("Text Field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요");
		bar.add(tf);
		contentPane.add(bar,BorderLayout.NORTH);
		
//		JToolBar toolBar = new JToolBar("Kitae Menu");
//		toolBar.setBackground(Color.LIGHT_GRAY);
//		toolBar.add(new JButton("New"));
//		
//		toolBar.add(new JButton(new ImageIcon(path+"icon1.jpg")));
//		toolBar.addSeparator();
//		
//		toolBar.add(new JButton(new ImageIcon(path+"icon2.jpg")));
//		toolBar.add(new JLabel("search"));
//		
//		toolBar.add(new JTextField("text Field"));
//		//toolBar.setFloatable(false);//툴바고정
//		JComboBox combo = new JComboBox();
//		combo.addItem("Java");
//		combo.addItem("C++");
//		combo.addItem("C#");
//		combo.addItem("C");
//		toolBar.add(combo);
//		contentPane.add(toolBar,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ToolBarEx();
	}
}
