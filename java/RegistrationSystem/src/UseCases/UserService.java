package UseCases;

import java.util.HashSet;
import java.util.Set;

public class UserService {
	Set<User> users;
	MainPage main;
	public UserService(MainPage main){
		users = new HashSet();
		this.main = main;
	}
	public void login(String username, String password){
		User current = null;
		for(User u: users){
			if(u.getUsername().equals(username) && u.getPassword().equals(password)){
				u.login();
				current = u;
				break;
			}
		}
		main.setCurrentUser(current);
		main.drawMainPanel();
	}
	public void logout(User u){
		u.logout();
	}
	public void add(User user) {
		this.users.add(user);
	}
	public void remove(User user) {
		for(User u: this.users){
			if(user.equals(u))
				this.users.remove(u);
		}
	}
	public Set<User> getUsers() {
		return this.users;
	}
}
