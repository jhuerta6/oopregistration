package UseCases;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends JFrame{
	private JTextField username = new JTextField(20);
	private JPasswordField pass = new JPasswordField(20);
	private JButton enter;
	
	public LoginWindow(ButtonActionListener listener){
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		JTextField username = this.username;
		JPasswordField pass = this.pass;
		JLabel usernameLabel = new JLabel("Username: ");
		JLabel passwordLabel = new JLabel("Password: ");
		mainPanel.add(usernameLabel);
		mainPanel.add(username);
		mainPanel.add(passwordLabel);
		mainPanel.add(pass);
		this.enter = new JButton("Login");
		enter.addActionListener(listener);
		mainPanel.add(enter);
		this.add(mainPanel);
		this.setVisible(true);
	}
	
	public String getUsernameInput(){
		return this.username.getText();
	}
	public String getPasswordInput(){
		return new String(this.pass.getPassword());
	}
}
