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
	public ButtonActionListener(MainPage source){
		this.source = source;
	}
	public ButtonActionListener(JTextField username, JPasswordField pass, JFrame window) {
		this.username = username;
		this.pass = pass;
		this.window = window;
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
	}
}
