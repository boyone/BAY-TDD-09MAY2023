package tdd;

public class ShoppingCart {

    private Catalog catalog;

    public ShoppingCart(Catalog catalog) {

        this.catalog = catalog;
    }

    public ProductDetail detail(int id, int qty) {
        Product product = catalog.find(id);
        return new ProductDetail(id, product.getName(), product.getPrice(), product.getPrice() * qty);
    }
}
