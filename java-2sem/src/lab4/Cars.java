package lab4;

public class Cars implements Priceable{
    private int price;

    public Cars(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}