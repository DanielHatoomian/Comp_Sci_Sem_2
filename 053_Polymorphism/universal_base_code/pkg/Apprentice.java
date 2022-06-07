package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	String school;
	int yearsOfExperience;

	public Apprentice() {
		this.school = "CVHS";
		this.yearsOfExperience = 0;
	}
	public Apprentice(String school, int yearsOfExperience) {
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String instrument, String school, int yearsOfExperience) {
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience) {
		this.name = name;
		this.age = age;
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public void playInstrument() {
		System.out.println(this.instrument+"making noise");
	}
	public void practice() {
		super.practice();
		System.out.println(yearsOfExperience+" years of experience");
	}
	public void perform() {
		super.perform();
	}
	public void practiceAtUniversity() {
		super.practice();
		System.out.println("at "+this.school);
	}

}

