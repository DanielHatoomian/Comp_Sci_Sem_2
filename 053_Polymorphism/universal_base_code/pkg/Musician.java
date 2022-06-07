package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	String instrument;

	public Musician() {
		this.instrument = "Cello";
	}
	public Musician(String instrument) {
		this.instrument  = instrument;
	}
	public Musician(String name, String instrument) {
		super(name);
		this.instrument = instrument;
	}
	public Musician(String name, int age, String instrument) {
		super(name, age);
		this.instrument = instrument;
	}
	public String getInstrument() {
		return this.instrument;
	}
	public void playInstrument() {
		System.out.println(this.instrument +": noise");
	}
	public void perform() {
		System.out.println("Performing");
	}
	public void practice() {
		System.out.println("Practicing");
	}

}

