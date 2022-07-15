package day10_JFrame;

import javax.swing.*;
import java.awt.*;

public class CraphicsDrawImageEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public CraphicsDrawImageEx() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,400);
		setVisible(true);

	}
	class MyPanel extends JPanel{
		String path = "C:\\Users\\user\\eclipse-workspace\\day10_project\\src\\day10_JFrame\\images\\";
		private ImageIcon icon = new ImageIcon(path+"image3.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20,20, this);
		}
	}
	public static void main(String[] args) {
		new CraphicsDrawImageEx();
	}
}


