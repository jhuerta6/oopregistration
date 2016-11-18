package UseCases;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ButtonActionListener implements ActionListener{
	MainPage source;
	public ButtonActionListener(MainPage source){
		this.source = source;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("Login")){
			LoginWindow login = new LoginWindow(this);
			System.out.println(arg0.getSource());
		}
		else if(arg0.getActionCommand().equals("Classes")){
			ClassesWindow classes = new ClassesWindow(source.classes);
		}

	}
}
