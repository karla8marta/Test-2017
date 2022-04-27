package ie.tudublin;

public class Product {

    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Product(TableRow tr) {
        this(tr.getString("Name"), tr.getInt("Price"));
    }

}
