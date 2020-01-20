package no.thaliar;

public class Product {
    protected Long productId;
    protected int price;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printProductDetails() {

    }
}
