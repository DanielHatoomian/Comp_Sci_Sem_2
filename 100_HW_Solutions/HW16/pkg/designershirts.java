public class designershirts extends clothing{
    String brand;
    public designershirts() {
        this.brand = "Gucci";
    }
    public designershirts(String brand) {
        this.brand = brand;
    }
    public designershirts(String brand, String clothingproducer) {
        super(clothingproducer, "150");
        this.brand = brand;
    }
    public designershirts(String brand, String clothingproducer, String price) {
        super(clothingproducer, price);
        this.brand = brand;
    }
    public void itemDescription() {
        System.out.println("This is a designer shirt");
    }
}