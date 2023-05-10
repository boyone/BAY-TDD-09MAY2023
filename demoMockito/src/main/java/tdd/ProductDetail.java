package tdd;

import java.util.Objects;

public class ProductDetail {

    private int id;
    private String name;
    private int price;
    private int totalPrice;

    public ProductDetail(int id, String name, int price, int totalPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public ProductDetail() {
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetail that = (ProductDetail) o;
        return id == that.id && price == that.price && totalPrice == that.totalPrice && Objects.equals(name, that.name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
