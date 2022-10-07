package homework;

public class Book {
    int price;

    public Book(int price) {
        this.price = price;
    }

    public int updatePrice(int d) {
        if (d > 150) {
            price = 150;
        } else if (d > 100) {
            price = 100;
        }
        return price;
    }
}
