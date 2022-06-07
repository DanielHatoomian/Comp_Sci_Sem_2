package pkg;
import java.util.Scanner;
import java.util.Random;


public class dwarf {
	String name;
	int age;
	public dwarf()
		{
			name = "";
			age = 0;
		}
		public dwarf(String name, int age) 
	{
		this();
		this.name = name;
		this.age = age;
		}

	public String getName()
	{
		return name;
	}
	public void setName(String a)
	{
		this.name = a;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		this.age = a;
	}
	public boolean isSameName(String name)
		{
			if(this.name.equals(name))
				{
					return true;
				}
				else{
					return false;
				}
		}
}
