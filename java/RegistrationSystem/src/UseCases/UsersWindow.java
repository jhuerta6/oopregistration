package UseCases;

import java.awt.BorderLayout;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UsersWindow extends JFrame{
	JFrame usersFrame;
	public UsersWindow(UserService users){
		usersFrame = new JFrame();
		usersFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		usersFrame.add(mainPanel);
		Set<User> userSet = users.getUsers();
		int numUsers = userSet.size();
		if(numUsers > 0){
			Object[][] usersTableData = new Object[numUsers][2];
			int i = 0;
			for(User u:userSet){
				usersTableData[i][0] = u.getName();
				usersTableData[i][1] = u.getId();
				i++;
			}
			String[] headers = new String[] {"Name", "Id"};
			JTable table = new JTable(usersTableData, headers);
			JScrollPane tableContainer = new JScrollPane(table);
			mainPanel.add(tableContainer, BorderLayout.CENTER);
		}
		usersFrame.setVisible(true);
	}

}
