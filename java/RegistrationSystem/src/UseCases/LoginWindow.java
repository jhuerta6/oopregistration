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
	private JTextField username;
	private JPasswordField pass;
	private JButton enter;
	
	public LoginWindow(){
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		this.username = new JTextField(20);
		this.pass = new JPasswordField(20);
		JLabel usernameLabel = new JLabel("Username: ");
		JLabel passwordLabel = new JLabel("Password: ");
		mainPanel.add(usernameLabel);
		mainPanel.add(this.username);
		mainPanel.add(passwordLabel);
		mainPanel.add(this.pass);
		
		ButtonActionListener listener = new ButtonActionListener(username, pass, this);
		this.enter = new JButton("Enter");
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
