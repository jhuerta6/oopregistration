package UseCases;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Class[] classes;
	private boolean authenticated = false;
	private String currUsername;
	private String currPassword;
	private User[] users;
	private JTextField username = new JTextField(20);
	private JPasswordField pass = new JPasswordField(20);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		final String[] classNames = new String[] {"Object Oriented Programming", "Automata", "Computer Architecture"};
		final String[] usernames = new String[] {"student1", "student2", "student3"};
		final String[] passwords = new String[] {"pass1", "pass2", "pass3"};
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setClasses(classNames);
					frame.setUsers(usernames, passwords);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainPage(){
		setTitle("SikiRegistration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Siki Registration");
		menuBar.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("View");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Classes");
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Login");
		mntmNewMenuItem_3.addActionListener(this);
		menuBar.add(mntmNewMenuItem_3);
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel welcome = new JPanel();
		panel.add(welcome, BorderLayout.NORTH);

		welcome.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		welcome.add(lblNewLabel, BorderLayout.NORTH);
		
		JTextPane txtpnFrom = new JTextPane();
		txtpnFrom.setText(" From here you can see available classes");
		welcome.add(txtpnFrom, BorderLayout.CENTER);
	}
	public void setClasses(String[] titles){
		this.classes = new Class[titles.length];
		for(int i = 0; i < this.classes.length; i++){
			classes[i] = new Class(titles[i]);
		}
	}
	public void setUsers(String[] usernames, String[] passwords){
		this.users = new User[usernames.length];
		for(int i = 0; i < this.users.length; i++){
			this.users[i] = new User(usernames[i], passwords[i]);
		}
	}
	public boolean authenticate(String username, String password){
		for(int i = 0; i < this.users.length; i++){
			if(users[i].getUsername().equals(username) && users[i].getPassword().equals(password))
				return true;
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("Classes")){
			JFrame classesFrame = new JFrame();
			classesFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BorderLayout());
			classesFrame.add(mainPanel);
			Object[][] classes = new Object[1][this.classes.length];
			for(int i = 0; i < this.classes.length; i++){
				classes[0][i] = this.classes[i].getTitle();
			}
			String[] headers = new String[] {"Class Title"};
			JTable table = new JTable(classes, headers);
			JScrollPane tableContainer = new JScrollPane(table);
			mainPanel.add(tableContainer, BorderLayout.CENTER);
			classesFrame.setVisible(true);
		}
		else if(arg0.getActionCommand().equals("Login")){
			JFrame loginFrame = new JFrame();
			loginFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
			JButton submit = new JButton("Submit");
			submit.addActionListener(this);
			mainPanel.add(submit);
			loginFrame.add(mainPanel);
			loginFrame.setVisible(true);
		}
		else if(arg0.getActionCommand().equals("Submit")){
			if(authenticate(this.username.getText(), new String(this.pass.getPassword()))){
				System.out.println("Logged in");
			}
			else{
				System.out.println("Incorrect combination");
			}
		}

	}

}
