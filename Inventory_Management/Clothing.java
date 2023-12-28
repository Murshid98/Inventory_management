public class Clothing extends Product {

    private String size;

    public Clothing(int productID, String productName, double price, String size) {
        super(productID, productName, price);
        this.size = size;
    }

    @Override
    void calculateDiscount() {
        if (size == "small") {
            System.out.println("Discount is 20% for small cloths");
        }
    }

}
