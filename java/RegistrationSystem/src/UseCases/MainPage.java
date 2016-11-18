package UseCases;

public class MainPage {
	public static void main(String[] args){
		//stuff happens here
		UserService users = new UserService();
		ClassStore classes = new ClassStore();
		Admin admin = new Admin("admin", "admin1", "Administrator Lopez", 80512345, classes, users);
		admin.addUser(new Student("umar", "umar1", "Ulises Martinez", 80511111));
		User currentUser = null;
		if((currentUser = users.login("umar", "umar11")) != null){
			System.out.println("Correct login");
			System.out.println(currentUser.getId());
		}
		else{
			System.out.println("Wrong login");
		}
	}

}
