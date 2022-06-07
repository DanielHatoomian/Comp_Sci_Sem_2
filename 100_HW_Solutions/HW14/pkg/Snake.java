package pkg;

public class Snake implements Pet {
    int age;
    String name;
    boolean trained;
    
    public Snake() {
        this("Bob", 2, true);
    }
    public Snake(String name) {
        this(name, 2, true);
    }
    public Snake(int age) {
        this("Bob", age, true);
    }
    public Snake(boolean trained) {
        this("Bob", 2, trained);
    }
    public Snake(String name, boolean trained) {
        this(name, 2, trained);
    }
    public Snake(String name, int age, boolean trained) {
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
   	   if(trained==true) {
   	       return true;
   	   }
   	   else if(trained==false) {
   	       return false;
   	   }
   	}
   	public void interact() {
   	    System.out.println("hiss");
   	    System.out.println("My name is "+this.name+" and I can bite people");
   	}
   	public void trick() {
   	    if(trained==true) {
   	        System.out.println("Bites and hisses");
   	    }
   	    else if(trained==false) {
   	        interact();
   	    }
   	}
   	
   	
}
