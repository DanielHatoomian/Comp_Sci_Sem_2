package pkg;
import java.util.Scanner;
import java.util.Random;

public interface Role {
	void setHealth(int health);
	int getHealth();
	String getName();
	void setName(String name);
	void attack();
	void printArt();
}
