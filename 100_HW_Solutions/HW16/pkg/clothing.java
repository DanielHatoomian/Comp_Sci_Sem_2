public class clothing {
    protected String price;
    protected String clothingproducer;
    
    public clothing(String clothingproducer,String price) {
        this.clothingproducer = clothingproducer;
        this.price = price;
    }
    public clothing(String price) {
        this.price = price;
        this.clothingproducer = "Kering";
    }
    public clothing(String clothingproducer) {
        this.clothingproducer = clothingproducer;
        this.price = "$250";
    }
    public clothing() {
        this.clothingproducer = "Kering";
        this.price = "$250";
    }
    public int getPrice() {
        return price;
    }
    public void itemDescription() {
        System.out.println("This is clothing");
    }
}