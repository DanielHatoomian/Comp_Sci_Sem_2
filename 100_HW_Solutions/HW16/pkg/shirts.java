public class shirts {
    
    String material;
    
    public shirts() {
        material = "Cotton";
    }
    public shirts(String material) {
        this.material = material;
    }
    public shirts(String material, String price) {
        super("",price);
        this.material = material;
    }
    public shirts(String material, String clothingproducer) {
        super(clothingproducer, "$100");
        this.material = material;
    }
    public void shirts() {
        System.out.println("This is a shirt");
    }
}