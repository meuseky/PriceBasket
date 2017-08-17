package pricebasket.domain.offer;


import pricebasket.domain.Product;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class ItemPercentOffer implements Offer {
    @Override
    public BigDecimal getOfferDiscount(LinkedHashMap<Product, Integer> productCount) {
        return null;
    }
}
