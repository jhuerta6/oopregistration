package UseCases;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ButtonActionListener implements ActionListener{
	MainPage source;
	JTextField username;
	JPasswordField pass;
	JFrame window;
	private JTextField title;
	private JTextField courseNumber;
	private JTextField days;
	private JTextField startTime;
	private JTextField endTime;
	public ButtonActionListener(MainPage source){
		this.source = source;
	}
	public ButtonActionListener(JTextField username, JPasswordField pass, JFrame window) {
		this.username = username;
		this.pass = pass;
		this.window = window;
	}
	public ButtonActionListener(JTextField title, JTextField courseNumber,
			JTextField days, JTextField startTime, JTextField endTime,
			MainPage m) {
		this.title = title;
		this.courseNumber = courseNumber;
		this.days = days;
		this.startTime = startTime;
		this.endTime = endTime;
		this.source = m;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("Enter")){
			//do stuff here
			String u = username.getText();
			String p = new String(pass.getPassword());
			source.users.login(u, p);
			window.setVisible(false);
			window.dispose();
		}
		else if(arg0.getActionCommand().equals("Create Class")){
			//case where submiting new class
			String t = this.title.getText();
			int cNumber = Integer.parseInt(this.courseNumber.getText());
			String d = this.days.getText();
			String s = this.startTime.getText();
			String e = this.endTime.getText();
			Class toAdd = new Class(t, cNumber, d, s, e);
			source.classes.add(toAdd);
		}
	}
}
