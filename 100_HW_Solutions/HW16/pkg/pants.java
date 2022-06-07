public class pants extends clothing {
    int length;
    public pants() {
        lenght = 32;
    }
    public pants(int length) {
        this.length = length;
    }
    public pants(int length, String clothingproducer) {
        super(clothingproducer, "$60");
        this.length = length;
    }
    public pants(int length, String clothingproducer, String price) {
        super(clothingproducer, price);
        this.length = length;
    }
    public void itemDescription() {
        System.out.println("nThese are pats");
    }
    
}