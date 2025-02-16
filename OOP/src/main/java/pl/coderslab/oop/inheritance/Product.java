import java.util.Objects;

class ZadProduct {
    public static void main(String[] args) {
        Product product = new Product("czekolada", 2.0);
    }
}

public class Product {
    private static int nextId;
    private int id;
    private String name;
    private double price;


    public Product(String name, double price) {
        this.id = nextId;
        this.name = name;
        setPrice(price);
        nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price > 0.01) {
            this.price = price;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
