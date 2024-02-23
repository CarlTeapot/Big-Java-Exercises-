package com.bigJavaExercises.Chapter12Exercises.Invoice;

import java.text.NumberFormat;

public class LineItem {
        private int quantity;
        private Product theProduct;
        private NumberFormat format;
        private String zaza;
        /**
         Constructs an item from the product and quantity.
         @param aProduct the product
         @param aQuantity the item quantity
         */
        public LineItem(Product aProduct, int aQuantity)
        {
            theProduct = aProduct;
            quantity = aQuantity;
            format = NumberFormat.getCurrencyInstance();
            zaza = format.format(theProduct.getPrice());
        }
        /**
         Computes the total cost of this line item.
         @return the total price
         */
        public double getTotalPrice() {
            return theProduct.getPrice() * quantity;
        }
        /**
         Formats this item.
         @return a formatted string of this line item
         */
        public String format() {


            return String.format("%-30s%8.2f%5d%8.2f", theProduct.getDescription(),zaza, quantity, getTotalPrice());
        }
    }

