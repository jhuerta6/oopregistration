package assignment_three_task_one;

public class User {
	private String name;
	private String username;
	private String password;

	public User(String names, String usernames, String passwords){
		setName(names);
		setUsername(usernames);
		setPassword(passwords);
	}
	/* Getters and setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	/* End getters and setters */

	/* Methods from class diagram */
	public void browseItem(){
		System.out.println("Method call: browseItem()");
	}

	public void register(){
		System.out.println("Method call: register()");
	}
	/* End methods from class diagram */
}
