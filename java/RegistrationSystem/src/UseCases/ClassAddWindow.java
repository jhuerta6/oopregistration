package UseCases;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ClassAddWindow extends JFrame{
	private JTextField title;
	private JTextField courseNumber;
	private JTextField days;
	private JTextField startTime;
	private JTextField endTime;
	private JButton enter;
	
	public ClassAddWindow(MainPage m){
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		this.title = new JTextField(20);
		this.courseNumber = new JTextField(20);
		this.days = new JTextField(20);
		this.startTime = new JTextField(20);
		this.endTime = new JTextField(20);
		JLabel titleLabel = new JLabel("Title: ");
		JLabel numLabel = new JLabel("Course number: ");
		JLabel daysLabel = new JLabel("Days: ");
		JLabel startLabel = new JLabel("Start Time: ");
		JLabel endLabel = new JLabel("End Time: ");
		mainPanel.add(titleLabel);
		mainPanel.add(this.title);
		mainPanel.add(numLabel);
		mainPanel.add(this.courseNumber);
		mainPanel.add(daysLabel);
		mainPanel.add(this.days);
		mainPanel.add(startLabel);
		mainPanel.add(this.startTime);
		mainPanel.add(endLabel);
		mainPanel.add(this.endTime);
		
		ButtonActionListener listener = new ButtonActionListener(title, courseNumber, days, startTime, endTime, m);
		this.enter = new JButton("Create Class");
		enter.addActionListener(listener);
		mainPanel.add(enter);
		this.add(mainPanel);
		this.setVisible(true);
	}
}
