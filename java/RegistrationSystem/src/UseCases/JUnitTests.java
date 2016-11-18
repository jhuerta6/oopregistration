package UseCases;
/**
 * Author: Topher
 * Cheers.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTests {
	public static void main(String[] args) {
		userTests();
		studentTests();
		adminTests(); //And UserService
		classStoreTests(); //And Class
	}
	
	public static void userTests() {
		User tester = new User("me", "12345", "Topher", 100);
		assertEquals("me", tester.getUsername());
		assertEquals("12345", tester.getPassword());
		assertEquals("Topher", tester.getName());
		assertEquals(100, tester.getId());
		
		User tester2 = tester;
		assertSame(tester, tester2);
		tester2 = new User("","","",0);
		assertNotSame(tester, tester2);
		assertEquals("", tester2.getUsername());
		assertEquals("", tester2.getPassword());
		assertEquals("", tester2.getName());
		assertEquals(0, tester2.getId());
		
		tester.login();
		assertTrue(tester.loggedIn);
		tester.logout();
		assertFalse(tester.loggedIn);
		System.out.println("User tests passed.");
	}
	
	public static void studentTests() {
		Student tester = null;
		assertNull(tester);
		tester = new Student("ECopper", "mask", "Evony", 412);
		Class oop = new Class("oop", 123, "TR", "12:00", "1:20");
		Class oop2 = new Class("oop", 321, "MW", "12:00", "1:20");
		assertNotNull(tester.getClasses());
		tester.register(oop);
		tester.register(oop2);
		assertNotNull(tester.getClasses());
		
		assertEquals(0.0, tester.getGPA(), 0);
		assertFalse(tester.checkHold());
		tester.removeHold();
		assertFalse(tester.checkHold());
		
		System.out.println("Student tests passed.");
	}
	
	public static void adminTests() {
		UserService access = new UserService();
		Admin tester = new Admin("LFairwind", "lyre", "Luthwin", 920, new ClassStore(), access);
		Student tester2 = new Student("ECopper", "mask", "Evony", 412);
		Class oop = new Class("oop", 123, "TR", "12:00", "1:20");
		
		tester.addUser(tester2);
		access.login("ECopper", "mask");
		assertTrue(tester2.loggedIn);
		access.logout(tester2);
		assertFalse(tester2.loggedIn);
		tester.removeUser(tester2);
		
		access.add(tester);
		access.login("LFairwind", "lyre");
		assertTrue(tester.loggedIn);
		access.logout(tester);
		assertFalse(tester.loggedIn);
		access.remove(tester);
		
		tester.addClass(oop);
		tester.removeClass(oop);
		System.out.println("Admin and UserService tests passed.");
	}
	
	
	public static void classStoreTests() {
		ClassStore tester = new ClassStore();
		Class oop = new Class("oop", 123, "TR", "12:00", "1:20");
		Class oop2 = new Class("", 0, "", "", "");
		tester.add(oop);
		assertEquals("oop", oop.getTitle());
		tester.add(oop2);
		assertEquals("", oop2.getTitle());
		
		assertNull(oop.getInstructor());
		assertNull(oop.getStudents());
		
		String a = "Course: oop\nCourse number: 123\nDays: TR\nStarts at: 12:00\nEnds at: 1:20";
		assertEquals(a, oop.toString());
		
		tester.remove(oop);
		tester.remove(oop2);
		
		System.out.println("ClassStore and Class tests passed.");
	}
	
	
	
}
