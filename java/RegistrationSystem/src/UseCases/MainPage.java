package UseCases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class MainPage extends JFrame{
	private JPanel contentPane;
	//private Class[] classes;
	private boolean authenticated = false;
	private String currUsername;
	private String currPassword;
	//private User[] users;
	private JTextField username = new JTextField(20);
	private JPasswordField pass = new JPasswordField(20);
	static UserService users;
	static ClassStore classes;
	public static void main(String[] args){
		//stuff happens here
		users = new UserService();
		classes = new ClassStore();
		Admin admin = new Admin("admin", "admin1", "Administrator Lopez", 80512345, classes, users);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainPage(){
		setTitle("SikiRegistration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		ButtonActionListener listener = new ButtonActionListener(this);
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);

		JMenuItem mntmNewMenuItem = new JMenuItem("Siki Registration");
		menuBar.add(mntmNewMenuItem);

		JMenu mnNewMenu = new JMenu("View");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Classes");
		mntmNewMenuItem_1.addActionListener(listener);
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Login");
		mntmNewMenuItem_3.addActionListener(listener);
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
}
