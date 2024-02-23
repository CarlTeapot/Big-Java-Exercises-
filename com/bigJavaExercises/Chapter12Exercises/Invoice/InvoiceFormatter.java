package com.bigJavaExercises.Chapter12Exercises.Invoice;

import java.util.ArrayList;

public class InvoiceFormatter extends Invoice {
    private Address billingAddress;
    private ArrayList<LineItem> items;

    /**
     * Constructs an invoice.
     *
     * @param anAddress the billing address
     */
    public InvoiceFormatter(Address anAddress) {
        super(anAddress);
        items = new ArrayList<>();
        billingAddress = anAddress;
    }

    public String format() {
        
        String r = " I N V O I C E\n\n" + billingAddress.format() + String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
        for (LineItem item : items) {
            r = r + item.format() + "\n";
        }
        r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
        return r;
    }
}
