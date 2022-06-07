package pkg;
import java.util.Scanner;
import java.util.Random;


public class zombie implements Creature{
	Random rand = new Random();
	int health;
	int attack;
	String name;
	
	public zombie() {
		this.name = "Zack";
		this.health = rand.nextInt(6)+5;
		this.attack = rand.nextInt(6)+5;
	}
	public void takeDamage(int damage) {
		this.health = this.health-damage;
	}
	

}

