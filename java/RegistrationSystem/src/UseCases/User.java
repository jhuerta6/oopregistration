package UseCases;

public class User {
	private String username;
	private String password;
	private String name;
	private int id;
	public boolean loggedIn;
	
	public User (String u, String p, String n, int id){
		this.username = u;
		this.password = p;
		this.id = id;
		this.name = name;
		this.loggedIn = false;
	}
	
	public String getUsername(){
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}

	public void login() {
		this.loggedIn = true;
	}
	public void logout(){
		this.loggedIn = false;
	}
}
