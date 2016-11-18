package UseCases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionListener implements ActionListener{
	MainPage source;
	public MenuActionListener(MainPage source){
		this.source = source;
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("Classes")){
			ClassesWindow classes = new ClassesWindow(source.classes);
		}
		else if(arg0.getActionCommand().equals("Login")){
			LoginWindow login = new LoginWindow();
		}

	}

}
