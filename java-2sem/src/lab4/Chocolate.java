package lab4;

public class Chocolate implements Priceable{
    private int price;

    public Chocolate(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
