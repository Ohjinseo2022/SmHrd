package day10_JFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class SliderEx extends JFrame {
	private JSlider [] sl = new JSlider[3];
	private JLabel colorLabel;
	public SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("SLIDER EXAMPLE");
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(20);
		for(int i = 0;i<sl.length;i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL,0,255,128);
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		int r = sl[0].getValue();
		int g = sl[0].getValue();
		int b = sl[0].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		c.add(colorLabel);
		c.add(slider);
		setSize(300,300);
		setVisible(true);
	}
	class MyChangeListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			colorLabel.setBackground(new Color(r,g,b));
		}
	}
	public static void main(String[] args) {
		new SliderEx();
	}
}
