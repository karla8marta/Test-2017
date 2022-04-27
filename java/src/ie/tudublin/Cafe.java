package ie.tudublin;

import java.util.ArrayList;
import processing.data.*;

public class Cafe {

    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Product> bill = new ArrayList<Product>();

    public void loadData() {

        Table t = loadTable("Cafe.csv", "header");

        for (TableRow row : t.rows()) {

            Product pro = new Product(row);
            products.add(pro);
        }
    }
}
