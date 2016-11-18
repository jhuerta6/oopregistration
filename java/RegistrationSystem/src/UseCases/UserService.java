package UseCases;

import java.util.HashSet;
import java.util.Set;

public class UserService {
	Set<User> users;
	public UserService(){
		users = new HashSet();
	}
	public User login(String username, String password){
		User current = null;
		for(User u: users){
			if(u.getUsername().equals(username) && u.getPassword().equals(password)){
				u.login();
				current = u;
			}
		}
		return current;
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
}
