package model;

public class SalesLineItem {
    private int quantity;
    private Product prod;

    public SalesLineItem(Product prod, int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("SalesLineItem quantity must be positive.");

        this.prod = prod;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return prod.getPrice() * quantity;
    }

}
