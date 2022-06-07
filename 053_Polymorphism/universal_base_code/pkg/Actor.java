package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer{
	String type;
	public Actor() {
		super();
		this.type = "theater";
	}
	public Actor(String type, String name) {
		super(name);
		this.type = type;
	}
	public void practice() {
		System.out.println("Practicing Acting");
	}
	public void perform() {
		System.out.println("Performing acting");
	}
	public void monolouge() {
		System.out.println("I don't know any monolouges");
	}

}

