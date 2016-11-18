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
	static UserService users;
	static ClassStore classes;
	User currentUser = null;
	MenuActionListener menuListener;
	ButtonActionListener buttonListener;
	public static void main(String[] args){
		//stuff happens here
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
		menuListener = new MenuActionListener(this);
		
		users = new UserService(this);
		classes = new ClassStore();
		Admin admin = new Admin("admin", "admin1", "Administrator Lopez", 80512345, classes, users);
		users.add(admin);
		
		drawMainPanel();

	}
	public void drawMainPanel(){
		this.contentPane.removeAll();
		JMenuBar menuBar = getMenu();
		this.contentPane.add(menuBar, BorderLayout.NORTH);
		JPanel panel = getInfoPanel();
		this.contentPane.add(panel, BorderLayout.CENTER);
		this.contentPane.revalidate();
		this.contentPane.repaint();
	}
	private JPanel getInfoPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel welcome = new JPanel();
		panel.add(welcome, BorderLayout.NORTH);

		welcome.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Welcome!");
		welcome.add(lblNewLabel, BorderLayout.NORTH);

		JTextPane txtpnFrom = new JTextPane();
		txtpnFrom.setText(" From here you can see available classes");
		welcome.add(txtpnFrom, BorderLayout.CENTER);
		return panel;
	}
	private JMenuBar getMenu() {
		JMenuBar menuBar = new JMenuBar();
		if(this.currentUser == null){
			//case where no one has logged in
			JMenuItem mntmNewMenuItem = new JMenuItem("Siki Registration");
			menuBar.add(mntmNewMenuItem);

			JMenu mnNewMenu = new JMenu("View");
			menuBar.add(mnNewMenu);

			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Classes");
			mntmNewMenuItem_1.addActionListener(menuListener);
			mnNewMenu.add(mntmNewMenuItem_1);

			JMenuItem mntmNewMenuItem_3 = new JMenuItem("Login");
			mntmNewMenuItem_3.addActionListener(menuListener);
			menuBar.add(mntmNewMenuItem_3);
		}
		else if(this.currentUser.getClass().getName().equals("UseCases.Student")){
			//case where user is a student
			JMenuItem mntmNewMenuItem = new JMenuItem("Siki Registration");
			menuBar.add(mntmNewMenuItem);

			JMenu mnNewMenu = new JMenu("View");
			menuBar.add(mnNewMenu);

			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Classes");
			mntmNewMenuItem_1.addActionListener(menuListener);
			mnNewMenu.add(mntmNewMenuItem_1);

			JMenuItem mntmNewMenuItem_3 = new JMenuItem("Logout");
			mntmNewMenuItem_3.addActionListener(menuListener);
			menuBar.add(mntmNewMenuItem_3);
		}
		else if(this.currentUser.getClass().getName().equals("UseCases.Instructor")){
			//case where user is an instructor
			JMenuItem mntmNewMenuItem = new JMenuItem("Siki Registration");
			menuBar.add(mntmNewMenuItem);

			JMenu mnNewMenu = new JMenu("View");
			menuBar.add(mnNewMenu);

			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Classes");
			mntmNewMenuItem_1.addActionListener(menuListener);
			mnNewMenu.add(mntmNewMenuItem_1);

			JMenuItem mntmNewMenuItem_3 = new JMenuItem("Logout");
			mntmNewMenuItem_3.addActionListener(menuListener);
			menuBar.add(mntmNewMenuItem_3);
		}
		else if(this.currentUser.getClass().getName().equals("UseCases.Admin")){
			//case where user is an administrator
			JMenuItem mntmNewMenuItem = new JMenuItem("Siki Registration");
			menuBar.add(mntmNewMenuItem);
			
			JMenu manageMenu = new JMenu("Manage");
			menuBar.add(manageMenu);
			JMenuItem manageClassesadd = new JMenuItem("Add Class");
			JMenuItem manageClassesremove = new JMenuItem("Remove Class");
			JMenuItem manageUseradd = new JMenuItem("Create User");
			JMenuItem manageUserremove = new JMenuItem("Remove User");
			manageClassesadd.addActionListener(menuListener);
			manageMenu.add(manageClassesadd);
			manageMenu.add(manageClassesremove);
			manageMenu.add(manageUseradd);
			manageMenu.add(manageUserremove);
			
			JMenu mnNewMenu = new JMenu("View");
			menuBar.add(mnNewMenu);

			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Classes");
			mntmNewMenuItem_1.addActionListener(menuListener);
			JMenuItem viewUsers = new JMenuItem("Users");
			viewUsers.addActionListener(menuListener);
			mnNewMenu.add(mntmNewMenuItem_1);
			mnNewMenu.add(viewUsers);

			JMenuItem mntmNewMenuItem_3 = new JMenuItem("Logout");
			mntmNewMenuItem_3.addActionListener(menuListener);
			menuBar.add(mntmNewMenuItem_3);
		}
		return menuBar;
	}
	public void setCurrentUser(User u){
		this.currentUser = u;
	}
}
