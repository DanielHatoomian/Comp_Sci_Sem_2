package pkg;

public class Bird implements Pet {
    int age;
    String name;
    boolean trained;
    
    public Bird() {
        this("Dave", 7, true);
    }
    public Bird(String name) {
        this(name, 7, true);
    }
    public Bird(int age) {
        this("Dave", age, true);
    }
    public Bird(boolean trained) {
        this("Dave", 7, trained);
    }
    public Bird(String name, boolean trained) {
        this(name, 7, trained);
    }
    public Bird(String name, int age, boolean trained) {
        this.name = name;
        this.age = age;
        this.trained = trained;
    }
   public void setName(String name) {
   	    this.name = name;
   	}
   	public void setAge(int age) {
   	    this.age = age;
   	}
   	public void setIsTrained(boolean trained) {
   	    if(trained==true) {
   	        this.trained = true;
   	    }
   	    if(trained==false) {
   	        this.trained = false;
   	    }
   	}
   	public String getName() {
   	    return this.name;
   	}
   	public int getAge() {
   	    return this.age;
   	}
   	public boolean getIsTrained() {
   	  return trained;
   	}
   	public void interact() {
   	    System.out.println("chirp");
   	    System.out.println("My name is "+this.name+" and I can fly");
   	}
   	public void trick() {
   	    if(trained) {
   	        System.out.println("Flies through hoop");
   	    }
   	    else if(trained==false) {
   	        interact();
   	    }
   	}
}
