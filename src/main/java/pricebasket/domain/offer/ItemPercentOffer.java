package pricebasket.domain.offer;


import pricebasket.domain.Product;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class ItemPercentOffer implements Offer {

    private String description;
    private String outputProduct;
    // 15% should be 0.15
    private BigDecimal discountPercent;

    public ItemPercentOffer(String description, String outputProduct, BigDecimal discountPercent) {
        description = this.description;
        outputProduct = this.outputProduct;
        discountPercent = this.discountPercent;
    }

    @Override
    public BigDecimal getOfferDiscount(LinkedHashMap<Product, Integer> productCount) {

        for (Map.Entry<Product, Integer> productEntry : productCount.entrySet()) {

            if (productEntry.getKey().getName().equals(outputProduct)) {
                BigDecimal count = BigDecimal.valueOf(productEntry.getValue());
                return discountPercent.multiply(count);
            }
        }
        return BigDecimal.ZERO;
    }
}
