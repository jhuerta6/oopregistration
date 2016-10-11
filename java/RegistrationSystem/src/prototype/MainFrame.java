package prototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
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
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Schedule");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Login");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Student");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Faculty");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel welcome = new JPanel();
		JPanel widgets = new JPanel();
		welcome.setLayout(new BorderLayout(0, 0));
		JPanel classes = new JPanel();
		JPanel records = new JPanel();
		widgets.setLayout(new BorderLayout(0, 0));
		JSplitPane widgetPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, classes, records);
		records.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar_2 = new JToolBar();
		records.add(toolBar_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("Check Records");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar_2.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		records.add(panel_2, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("View Transcript");
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Check Holds");
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View GPA");
		panel_2.add(btnNewButton_4);
		classes.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar_1 = new JToolBar();
		classes.add(toolBar_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Add or Remove Classes");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar_1.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		classes.add(panel_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Add Class");
		btnNewButton.setBackground(Color.GREEN);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Class");
		btnNewButton_1.setBackground(Color.RED);
		panel_1.add(btnNewButton_1);
		widgets.add(widgetPane);
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, welcome, widgets);
		
		JToolBar toolBar = new JToolBar();
		welcome.add(toolBar, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Welcome Student!");
		toolBar.add(lblNewLabel);
		
		JTextPane txtpnFrom = new JTextPane();
		txtpnFrom.setText(" From here you can manage your classes, view your schedule or check your records! ");
		welcome.add(txtpnFrom, BorderLayout.SOUTH);
		panel.add(splitPane);
	}

}
