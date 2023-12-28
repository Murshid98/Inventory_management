public class Main {

    public static void main(String[] args) {

        Electronics e1 = new Electronics(101, "TV", 7000, 12);
        Clothing c1 = new Clothing(201, "Pants", 1000, "small");

        Inventory I1 = new Inventory();

        I1.addProduct(e1);
        I1.addProduct(c1);

        I1.printPdoduct();

    }

}
