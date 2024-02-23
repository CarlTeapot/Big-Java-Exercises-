package com.bigJavaExercises.Chapter12Exercises.Invoice;

public class FixedLineItem extends LineItem {

    private Product theProduct;

    public FixedLineItem(Product sideCosts) {
        super(sideCosts,1);
        sideCosts = theProduct;
    }
    public double getTotalPrice() {
        return theProduct.getPrice();
    }
    /**
     Formats this item.
     @return a formatted string of this line item
     */
    public String format()
    {
        return String.format("%-30s%8.2f%5d%8.2f", theProduct.getDescription(), getTotalPrice());
    }
}
