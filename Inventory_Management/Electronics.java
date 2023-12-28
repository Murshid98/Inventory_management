public class Electronics extends Product {

    private int warrentyPeriod;

    public Electronics(int productID, String productName, double price, int warrentyPeriod) {
        super(productID, productName, price);
        this.warrentyPeriod = warrentyPeriod;
    }

    @Override
    void calculateDiscount() {
        if (warrentyPeriod < 12) {
            System.out.println("50 % discount for under warrenty products");
        }

    }

}
