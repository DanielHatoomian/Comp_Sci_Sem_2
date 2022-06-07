public class socks extends clothing {
    String type;
    
    public socks() {
        this.type = "short";
    }
    public socks(String type) {
        this.type = type;
    }
    public socks(String type, String clothingproducer) {
        super(clothingproducer, "$30");
        this.type = type;
    }
    public void itemDescription() {
        System.out.println("This is a sock");
    }
}