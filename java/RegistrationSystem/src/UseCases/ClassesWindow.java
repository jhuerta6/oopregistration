package UseCases;

import java.awt.BorderLayout;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ClassesWindow extends JFrame{
	JFrame classesFrame;
	public ClassesWindow(ClassStore store){
		classesFrame = new JFrame();
		classesFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		classesFrame.add(mainPanel);
		Set<Class> classSet = store.getClasses();
		int numClasses = classSet.size();
		if(numClasses > 1){
			Object[][] classes = new Object[numClasses][1];
			int i = 0;
			for(Class c:classSet){
				classes[i][0] = c.getTitle();
				i++;
			}
			String[] headers = new String[] {"Class Title"};
			JTable table = new JTable(classes, headers);
			JScrollPane tableContainer = new JScrollPane(table);
			mainPanel.add(tableContainer, BorderLayout.CENTER);
		}
		classesFrame.setVisible(true);
	}

}
