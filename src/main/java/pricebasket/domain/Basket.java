package pricebasket.domain;

import pricebasket.domain.offer.Offer;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {

    private LinkedHashMap<Product, Integer> productCount;
    private LinkedHashMap<Offer, BigDecimal> offerDiscounts;

    public Basket() {
        this.productCount = new LinkedHashMap();
        this.offerDiscounts = new LinkedHashMap();
    }

    public void addProduct(String productName) {
        for (Map.Entry<Product, Integer> productEntry : productCount.entrySet()) {
            // TODO should it add an entry with 0 if the entry isn't in the Map
            if (productEntry.getKey().getName().equals(productName)) {
                Integer count = productEntry.getValue() + 1;
                productEntry.setValue(count);
                return;
            }
            // TODO maybe catch exceptions here, non-existant product names
        }
    }

    public LinkedHashMap<Offer, BigDecimal> getOfferDiscounts() {
        return offerDiscounts;
    }

    public BigDecimal getSubtotal() {
        BigDecimal subTotal = BigDecimal.valueOf(0);

        for (Map.Entry<Product, Integer> productEntry : productCount.entrySet()) {
            BigDecimal productSubTotal = productEntry.getKey().getPrice().multiply(new BigDecimal(productEntry.getValue()));
            subTotal = subTotal.add(productSubTotal);
        }

        return subTotal;
    }

    private void computeDiscounts() {
        for (Map.Entry<Offer, BigDecimal> offer : offerDiscounts.entrySet()) {
            BigDecimal discount = offer.getKey().getOfferDiscount(this.productCount);
            offer.setValue(discount);
        }
    }

    public BigDecimal getTotal() {
        BigDecimal total = getSubtotal();

        computeDiscounts();
        BigDecimal totalDiscount = BigDecimal.ZERO;
        for (BigDecimal discount : offerDiscounts.values()) {
            totalDiscount = totalDiscount.add(discount);
        }

        return total.subtract(totalDiscount);
    }

}
