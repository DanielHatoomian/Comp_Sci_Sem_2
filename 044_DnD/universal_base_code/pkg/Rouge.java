package pkg;
import java.util.Scanner;
import java.util.Random;

public class Rouge {
	int health;
	int attack;
	String name;
	int attackdamage;
	Random rand = new Random();

	public Rouge() {
		this.health = 100;
		this.attackdamage = rand.nextInt(15)+1;
		this.name = "Rouge";
	}
	public Rouge(String name)
	{
		this.name = name;
		this.health = 100;
		this.attackdamage = rand.nextInt(15)+1;
	}
	public void setHealth(int health)
		{
			this.health = health;
		}
	public int getHealth()
		{
			return this.health;
		}
	public String getName()
		{
			return this.name;
		}
	public void attackWarrior(Warrior w)
		{
			System.out.println(this.name+" attacked "+w.getName());
			w.setHealth(w.getHealth()-this.attackdamage);
		}
	public void attackWizard(Wizard x)
		{
			System.out.println(this.name+" attacked "+x.getName());
			x.setHealth(x.getHealth()-this.attackdamage);
		}
}